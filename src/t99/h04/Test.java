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
		 * home������Ŀ¼��������� ��չ��Ϊtxt���ļ����ļ���ÿ�б�����һ���˵�����
		 * ����ҳ�����������homeĿ¼�£�����txt�ļ��е����֣����ŵ�һ��Set���淵��
		 */
		String home = "G:\\JavaPros\\myhw2\\src\\t99\\h04\\home1\\";
		Set<String> set = myFileUtil.getNamesInEveryTxtFile(home);
		if (set.contains("����") && set.size() == 1) {
			System.out.println("ok test case 1");
		}
		home = "G:\\JavaPros\\myhw2\\src\\t99\\h04\\home2\\";
		set = myFileUtil.getNamesInEveryTxtFile(home);
		if (set.contains("����") && set.contains("����") && set.size() == 2) {
			System.out.println("ok test case 2");
		}
	}
}
