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
 * ��һ���ַ������ַ�������Ƶ�ʵĸߵ������򷵻أ���������ַ����ֵ�Ƶ��һ���������ȳ��ֵ��ַ�����ǰ��
 * ���磺orderChar(��abcdefg��)���� ��abcdefg��
 * orderChar(��abcdefgg��)���� ��gabcdef��
 * orderChar(��abcdefgge��)���� ��egabcdf��
 * orderChar(������ѧ���ѧԺ��)���� ��ѧ�������Ժ��
 */
    public static void main(String[] args) {
        MyUtil util = new MyUtil();
        //����Ҫ���orderChar����
        if (util.orderChar("����ѧ���ѧԺ").equals("ѧ�������Ժ")) {
            System.out.println("������");
        }

    }



}
