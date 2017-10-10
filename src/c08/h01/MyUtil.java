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
     * �����һ�������в��ظ����ַ��ĸ��������硰���������ѧ �����ظ��ַ�Ϊ5
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
     * ����һ�������У�����Ƶ����ߵ��ַ��������ǲ��е�һ������� ���磺getFrequentChar("�ú�ѧϰ") ����'��'
     * ���磺getFrequentChar("��������ѧ���ѧԺѧ��") ����'ѧ'
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
     * ����������ǵĵ�n�У��ո���*��ʾ ���� getPascalTriangle(1)���� ��1�� getPascalTriangle(2)���� ��1*1��
     * getPascalTriangle(3)���� ��1*2*1��
     *
     * @param n
     * @return ����������ǵĵ�n�У��ո���*��ʾ(�ӵ�һ�м�Ϊ1)
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
