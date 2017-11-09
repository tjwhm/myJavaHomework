package t99.h04;

import java.util.Iterator;
import java.util.Set;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyFileUtil myFileUtil = new MyFileUtil();
		/**
		 * home及其子目录存放了若干 扩展名为txt的文件，文件中每行标存放了一个人的名字
		 * 请查找出出现在所有home目录下，所有txt文件中的名字，并放到一个Set里面返回
		 */
		String home = "G:\\JavaPros\\myhw2\\src\\t99\\h04\\home1\\";
		Set<String> set = myFileUtil.getNamesInEveryTxtFile(home);
		if (set.contains("赵六") && set.size() == 1) {
			System.out.println("ok test case 1");
		}
		home = "G:\\JavaPros\\myhw2\\src\\t99\\h04\\home2\\";
		set = myFileUtil.getNamesInEveryTxtFile(home);
		if (set.contains("王五") && set.contains("赵六") && set.size() == 2) {
			System.out.println("ok test case 2");
		}
	}
}
