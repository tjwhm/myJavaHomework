package t99.h02;

public class MyMathUtil {

	public int greatestCommonDivisor(int num1, int num2) {
		int min = getMin(num1, num2);
		for (int i = min; i > 1; --i) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}

	private int getMin(int num1, int num2) {
		if (num1 > num2) {
			return num2;
		} else {
			return num1;
		}
	}

}
