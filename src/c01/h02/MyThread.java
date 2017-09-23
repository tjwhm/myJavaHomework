package c01.h02;

/**
 * Created by tjwhm on 2017/9/19 13:52
 * Happy coding !
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread");

        }
    }
}
