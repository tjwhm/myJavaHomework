package e01;

public class Test {

    public Test() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // ʵ������ҵ��ʱ���ļ����λ�ÿ����б仯

        try {
            String filename = "G:\\JavaPros\\myhw2\\src\\e01\\red.txt";
            // analysisRedͳ��ÿ�������������'֮' �ĳ��ֵĴ�������������ص������У�
            // �����е�i��Ԫ�ر�ʾ��i+1�س��ֵ�'֮' ���ֵĴ���
            int[] counts = new Analysis().analysisRed(filename);
            for (int i = 0; i < counts.length; i++) {
                System.out.println(counts[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
