package c05.h01;

/*
  Created by tjwhm on 2017/9/26 13:46
  Happy coding !
 */
public class Human {
    private String name;
    private int score;
    private int age;

    public Human(String name) {
        this.name = name;
    }
    public Human(){

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
