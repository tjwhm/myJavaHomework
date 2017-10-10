/**
 *
 */
package c08.h01;

import java.util.*;

/**
 * @author Administrator
 */
public class MyUtil {

    public MyUtil() {
        // TODO Auto-generated constructor stub
    }

    /**
     * 计算出一段文字中不重复的字符的个数，例如“天津市天津大学 ”不重复字符为5
     *
     * @param s
     * @return
     */
    public int getDistinctCharCount(String s) {
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    break;
                } else if (j == i - 1) {
                    ++res;
                }
            }
        }
        return res;
    }

    /**
     * 返回一段文字中，出现频率最高的字符（不考虑并列第一的情况） 例如：getFrequentChar("好好学习") 返回'好'
     * 例如：getFrequentChar("我是天津大学软件学院学生") 返回'学'
     *
     * @param s
     * @return
     */
    public char getFrequentChar(String s) {
        List<Character> distinctChars = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    break;
                } else if (j == i - 1) {
                    distinctChars.add(s.charAt(i));
                    weights.add(0);
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < distinctChars.size(); j++) {
                if (s.charAt(i) == distinctChars.get(j)) {
                    weights.set(j, weights.get(j) + 1);
                }
            }
        }
        int index = 0;
        for (int i = 1; i < weights.size(); i++) {
            if (weights.get(i) > weights.get(i - 1)) {
                index = i;
            }
        }

        return distinctChars.get(index);
    }

    /**
     * 返回杨辉三角的第n行，空格用*表示 例如 getPascalTriangle(1)返回 “1” getPascalTriangle(2)返回 “1*1”
     * getPascalTriangle(3)返回 “1*2*1”
     *
     * @param n
     * @return 返回杨辉三角的第n行，空格用*表示(从第一行记为1)
     */
    public String getPascalTriangle(int n) {
        List<Integer> list = getTriangle(n);
        StringBuilder res = new StringBuilder(list.get(0).toString());
        for (int i = 1; i < n; i++) {
            res.append("*").append(list.get(i).toString());
        }
        return res.toString();
    }

    private List<Integer> getTriangle(int n) {
        List<Integer> list = new ArrayList();
        if (n == 1) {
            list.add(1);
            return list;
        } else {
            list.add(1);
            for (int i = 1; i < n - 1; i++) {
                list.add(getTriangle(n - 1).get(i - 1) + getTriangle(n - 1).get(i));
            }
            list.add(1);
        }
        return list;
    }

}
