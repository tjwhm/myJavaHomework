package c05.h01;


/*
  Created by tjwhm on 2017/9/26 13:46
  Happy coding !
 */
public class TjuStudent extends Human implements Youth, Student {
    public int socre;
    public int age;


    public TjuStudent(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScore() {
        return socre;
    }

    @Override
    public void setScore(int a) {
        this.socre = a;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int b) {
        this.age = b;
    }

}
