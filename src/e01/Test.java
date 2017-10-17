package e01;

public class Test {

    public Test() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 实际批作业的时候，文件存放位置可能有变化

        try {
            String filename = "G:\\JavaPros\\myhw2\\src\\e01\\red.txt";
            // analysisRed统计每回文章里面包含'之' 的出现的次数，将结果返回到数组中，
            // 数组中第i个元素表示第i+1回出现的'之' 出现的次数
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
