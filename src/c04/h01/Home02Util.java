
package c04.h01;


public class Home02Util {

    /**
     *
     */
    public Home02Util() {
        // TODO Auto-generated constructor stub
    }

    /**
     * ��ҵc02.h01.1
     * �ж�a,b,c�Ƿ��ܹ����������ε�������
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * �ж������������Ƿ���ȣ�һ����Ϊ��������������Ĳ�ֵС��0.0001������Ϊ���
     *
     * @param f1
     * @param f2
     * @return
     */
    public boolean isEq(float f1, float f2) {
        return -0.0001 < f1 - f2 && f1 - f2 < 0.0001;
    }

    /**
     * ��ѧ���ٷ�֮�ɼ��任ΪA(>=90,B>=80�ҷ�A,C>=70�ҷ�C,D>=60�ҷ�D,E ����)
     *
     * @param score
     * @return
     */
    public String getGrade(int score) {
        if (score > 89) {
            return "A";
        } else if (score > 79) {
            return "B";
        } else if (score > 69) {
            return "C";
        } else if (score > 59) {
            return "D";
        } else {
            return "E";
        }
    }

    /**
     * �ж�һ�������Ƿ����������������������true������false
     *
     * @param i
     * @return
     */
    public boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
