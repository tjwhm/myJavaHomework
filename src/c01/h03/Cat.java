package c01.h03;

/**
 * Created by tjwhm on 2017/9/12 13:47
 * Happy coding !
 **/
public class Cat {

    static int count = 0;

    Cat() {
        count++;
    }

    public static int getTotalCount() {
        return count;
    }
}
