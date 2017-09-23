package c01.h02;

public class Test {
    public static void main(String[] args) {
        int x = 32;
        int i = 1;
        while (x > 0) {
            x = x - i;
            i++;
        }
        i--;
        System.out.println(i);

        int a = 0;
        for ( i = 1; i < 8; ++i) {
            a += i;
        }
        System.out.println(a);
    }
}