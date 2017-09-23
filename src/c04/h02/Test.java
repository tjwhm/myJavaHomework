/**
 *
 */
package c04.h02;

import c04.h02.Child;
import c04.h02.Parent;

/**
 * @author Administrator
 */
public class Test {

    /**
     *
     */
    public Test() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Parent p = new Parent("");
        Child c = new Child();
        if ((c instanceof Parent)) {
            System.out.println(1);
        }
        if (p.speak().equals("parent")) {
            System.out.println(2);
        }
        if (c.speak().equals("child")) {
            System.out.println(3);
        }

        p = new Parent("jack");
        if (p.getName().equals("jack")) {
            System.out.println(4);
        }

        c = new Child("tom");
        if (c.getName().equals("tom")) {
            System.out.println(5);
        }


    }

}
