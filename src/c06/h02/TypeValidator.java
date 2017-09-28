package c06.h02;

/*
  Created by tjwhm on 2017/9/28 15:53
  Happy coding !
 */
public class TypeValidator {
    void validate(Object o) throws RuntimeException{
        if (o instanceof String){
            throw  new RuntimeException(){
                @Override
                public String getMessage() {
                    return "String is not a valid type!";
                }
            };
        }else{
            //donothing
        }
    }
}
