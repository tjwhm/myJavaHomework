package c04.h04;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        if (Dog.getCount() == 1) {
            System.out.println("1");
        }

        dog = Dog.getDog();
        if (Dog.getCount() == 2) {
            System.out.println("2");
        }

        dog = Dog.getDog();
        if (Dog.getCount() == 2) {
            System.out.println("3");
        }
        dog = new Dog();
        if (Dog.getCount() == 3) {
            System.out.println("4");
        }
    }

}
