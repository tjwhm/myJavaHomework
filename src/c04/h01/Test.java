/**
 *
 */
package c04.h01;

public class Test {
    public Test() {
    }
    public static void main(String[] args) {

        // ���Home02Util���е�isTriangle  isEq getGrade isPrime�ĸ�����
        if (new Home02Util().isTriangle(2, 4, 3)) {
            //������
            System.out.println(1);
        }

        if (new Home02Util().isEq(0.002f, 0.001f + 0.001f)) {
            //������
            System.out.println(2);
        }

        if (new Home02Util().getGrade(95).equals("A")) {
            //������
            System.out.println(3);
        }
        if (new Home02Util().isPrime(17)) {
            //������
            System.out.println(4);
        }

    }

}
