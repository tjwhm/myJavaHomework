package c09.h01;


import java.util.*;

public class MyUtil {

    public MyUtil() {
        // TODO Auto-generated constructor stub
    }

    /**
     * ��һ���ַ������ַ�������Ƶ�ʵĸߵ������򷵻أ���������ַ����ֵ�Ƶ��һ���������ȳ��ֵ��ַ�����ǰ��
     * ���磺orderChar(��abcdefg��)���� ��abcdefg��
     * orderChar(��abcdefgg��)���� ��gabcdef��
     * orderChar(��abcdefgge��)���� ��egabcdf��
     * orderChar(������ѧ���ѧԺ��)���� ��ѧ�������Ժ��
     *
     * @param content
     * @return
     */
    public String orderChar(String content) {
        List<MyChar> list = getFrequentChar(content);
        StringBuilder stringBuilder = new StringBuilder("");
        Collections.sort(list, new Comparator<MyChar>() {
            @Override
            public int compare(MyChar o1, MyChar o2) {
                if (o1.weight == o2.weight) {
                    return o1.index - o2.index;
                } else {
                    return o2.weight - o1.index;
                }
            }
        });
        for (MyChar myChar : list) {
            stringBuilder.append(myChar.character);
        }

        return stringBuilder.toString();
    }

    private List<MyChar> getFrequentChar(String s) {
        List<Character> distinctChars = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();
        distinctChars.add(s.charAt(0));
        weights.add(0);
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

        List<MyChar> list = new ArrayList<>();
        for (int i = 0; i < weights.size(); i++) {
            list.add(new MyChar(i, distinctChars.get(i), weights.get(i)));
        }
        return list;
    }

    class MyChar {

        public MyChar(Integer index, Character character, Integer weight) {
            this.index = index;
            this.character = character;
            this.weight = weight;
        }

        Integer index;
        Character character;
        Integer weight;
    }
}
