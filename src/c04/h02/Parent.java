package c04.h02;

/**
 * Created by tjwhm on 2017/9/22 10:56
 * Happy coding !
 **/
public class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }
    Parent(){

    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "parent";
    }
}
