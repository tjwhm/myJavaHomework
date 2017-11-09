package t99.h01;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyStrUtil util = new MyStrUtil();

		if (util.getSpaceCount("1 2 3 ") == 3) {
			System.out.println("ok test case1");
		}
		if (util.getSpaceCount("  ") == 2) {
			System.out.println("ok test case2");
		}
		if (util.getSpaceCount("abc") == 0) {
			System.out.println("ok test case3");
		}
		if (util.getSpaceCount(" abc") == 1) {
			System.out.println("ok test case4");
		}
	}

}
