package c06.h03;

/*
  Created by tjwhm on 2017/9/28 15:58
  Happy coding !
 */
public class AgeCheck implements AgeCheckInterface {
    @Override
    public void checkAge(int age) throws RuntimeException {
        if (age < 0 || age > 200) {
            throw new RuntimeException(){
                @Override
                public String getMessage() {
                    return super.getMessage();
                }
            };
        }
    }
}
