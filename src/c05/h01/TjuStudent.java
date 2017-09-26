package c05.h01;

/*
  Created by tjwhm on 2017/9/26 13:47
  Happy coding !
 */
public class TjuStudent extends Human implements Youth, Student {

    public TjuStudent(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getScore() {
        return super.getScore();
    }

    @Override
    public void setScore(int score) {
        super.setScore(score);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
