package t99.h01;

public class MyStrUtil {

	public int getSpaceCount(String string) {
		// TODO Auto-generated method stub
		int res = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				res++;
			}
		}
		return res;
	}

}
