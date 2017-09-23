package c04.h03;

import java.util.Objects;

/**
 * Created by tjwhm on 2017/9/22 11:04
 * Happy coding !
 **/
public class Student {
    String name;
    String pid;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "name=" + getName() + " pid=" + getPid();
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return Objects.equals(pid, student.getPid());

    }


}
