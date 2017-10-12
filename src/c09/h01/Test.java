package c09.h01;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {

    public Test() {
        // TODO Auto-generated constructor stub
    }

/**
 * 将一个字符串中字符按出现频率的高到低排序返回，如果两个字符出现的频率一样，则将最先出现的字符排在前面
 * 例如：orderChar(“abcdefg”)返回 “abcdefg”
 * orderChar(“abcdefgg”)返回 “gabcdef”
 * orderChar(“abcdefgge”)返回 “egabcdf”
 * orderChar(“天津大学软件学院”)返回 “学天津大软件院”
 */
    public static void main(String[] args) {
        MyUtil util = new MyUtil();
        //具体要求见orderChar方法
        if (util.orderChar("天津大学软件学院").equals("学天津大软件院")) {
            System.out.println("作对了");
        }

    }



}
