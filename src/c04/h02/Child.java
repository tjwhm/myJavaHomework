package c04.h02;

/**
 * Created by tjwhm on 2017/9/22 10:56
 * Happy coding !
 **/
public class Child extends Parent{


    Child(String name) {
        super(name);
    }
    Child(){

    }

    @Override
    public String speak() {
        return "child";
    }
}
