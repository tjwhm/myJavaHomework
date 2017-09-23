
package c04.h01;


public class Home02Util {

    /**
     *
     */
    public Home02Util() {
        // TODO Auto-generated constructor stub
    }

    /**
     * 作业c02.h01.1
     * 判断a,b,c是否能够构成三角形的三个边
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
     * 判断两个浮点数是否相等，一般认为如果两个浮点数的差值小于0.0001，即认为相等
     *
     * @param f1
     * @param f2
     * @return
     */
    public boolean isEq(float f1, float f2) {
        return -0.0001 < f1 - f2 && f1 - f2 < 0.0001;
    }

    /**
     * 将学生百分之成绩变换为A(>=90,B>=80且非A,C>=70且非C,D>=60且非D,E 其他)
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
     * 判断一个数字是否是质数，如果是质数返回true，否则false
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
