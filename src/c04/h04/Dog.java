package c04.h04;

/**
 * Created by tjwhm on 2017/9/22 11:07
 * Happy coding !
 **/
public class Dog {

    static int count = 0;
    private static Dog dog;

    Dog() {
        ++count;
    }

    public static Dog getDog() {
        if (dog == null) {
            dog = new Dog();
        }
        return dog;
    }

    public static int getCount() {
        return count;
    }
}
