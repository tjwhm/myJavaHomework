package c06.h01;

/*
  Created by tjwhm on 2017/9/28 15:48
  Happy coding !
 */
public class Dog {

    private int belly;

    Dog() {
        belly = 0;
    }

    void feed() throws Exception {
        if (belly == 3) {
            throw new Exception(){
                @Override
                public String getMessage() {
                    return "I can not eat more!";
                }
            };
        } else {
            ++belly;
        }
    }

}
