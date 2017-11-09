package t99.h04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyFileUtil {
	private Set<String> res = new HashSet<>();
	private List<MyStr> temp = new ArrayList<>();
	private int fileNum = 0;

	public Set<String> getNamesInEveryTxtFile(String home) {
		fileNum = 0;
		temp.clear();
		res.clear();
		process(home);
		Iterator<MyStr> iterator = temp.iterator();
		while (iterator.hasNext()) {
			MyStr myStr = iterator.next();
			if (myStr.num == fileNum) {
				res.add(myStr.name);
			}
		}
		return res;
	}

	private void process(String path) {
		File file = new File(path);
		if ((!file.isDirectory()) && file.getName().substring(file.getName().length() - 3).equals("txt")) {
			try {
				++fileNum;
				InputStream is = new FileInputStream(path);
				String line;
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "gbk"));
				line = reader.readLine();
				while (line != null) {
					for (int i = 0; i < temp.size(); ++i) {
						if (temp.get(i).name.equals(line)) {
							temp.set(i, new MyStr(line, temp.get(i).num + 1));
							break;
						} else if (i == temp.size() - 1) {
							temp.add(new MyStr(line, 1));
							break;
						}
					}
					if (temp.size() == 0) {
						temp.add(new MyStr(line, 1));
					}
					line = reader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				process(files[i].getPath());
			}
		}
	}

	class MyStr {

		String name;
		int num = 0;

		public MyStr(String name, int num) {
			this.name = name;
			this.num = num;
		}
	}
}
