package t99.h02;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ���MyMathUtil�࣬���� greatestCommonDivisor
		 * ���Լ���������������ÿ�����������ᳬ��1000000�������Լ��
		 */
		MyMathUtil myMathUtil = new MyMathUtil();
		if (myMathUtil.greatestCommonDivisor(18, 12) == 6) {
			System.out.println("ok test case1");
		}
		if (myMathUtil.greatestCommonDivisor(10, 100) == 10) {
			System.out.println("ok test case2");
		}
		if (myMathUtil.greatestCommonDivisor(73, 73) == 73) {
			System.out.println("ok test case3");
		}
		if (myMathUtil.greatestCommonDivisor(48, 24) == 24) {
			System.out.println("ok test case4");
		}

	}

}
