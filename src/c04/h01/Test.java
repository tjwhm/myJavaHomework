/**
 *
 */
package c04.h01;

public class Test {
    public Test() {
    }
    public static void main(String[] args) {

        // 完成Home02Util类中的isTriangle  isEq getGrade isPrime四个方法
        if (new Home02Util().isTriangle(2, 4, 3)) {
            //做对了
            System.out.println(1);
        }

        if (new Home02Util().isEq(0.002f, 0.001f + 0.001f)) {
            //做对了
            System.out.println(2);
        }

        if (new Home02Util().getGrade(95).equals("A")) {
            //做对了
            System.out.println(3);
        }
        if (new Home02Util().isPrime(17)) {
            //做对了
            System.out.println(4);
        }

    }

}
