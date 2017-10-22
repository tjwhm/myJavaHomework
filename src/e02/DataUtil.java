package e02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 同学可以根据实际需要增加新的类，但是必须和DataUtil类处在一个目录中，且不能有子目录
 *
 * @author Administrator
 */
public class DataUtil {
    /**
     * detail.txt文件是一个超市的购物小票 每行表示一次购物，每个商品之间用半角逗号分开 请找出 “哪 两个商品总被同时 购买"
     * 将这两个商品名字用逗号分隔 返回
     *
     * @param detailFileName 购物小票的文件名
     * @return
     */
    public String getFrequentItem(String detailFileName) throws Exception {
        InputStream is = new FileInputStream(detailFileName);
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, "gbk"));
        line = reader.readLine();
        List<CombineProducts> res = new ArrayList<>();
        res.add(new CombineProducts("a", "a", 0));
        while (line != null) {
            List<CombineProducts> combineProductsFromThisLine = getCombineListFromLine(line);
            for (int i = 0; i < combineProductsFromThisLine.size(); i++) {
                for (int j = 0; j < res.size(); j++) {
                    if (res.get(j).equals(combineProductsFromThisLine.get(i))) {
                        CombineProducts temp = res.get(j);
                        res.set(j, new CombineProducts(temp.product1, temp.product2, temp.frequency + 1));
                    } else {
                        res.add(combineProductsFromThisLine.get(i));
                    }
                }
            }
            line = reader.readLine();
        }
        Collections.sort(res,new Comparator<CombineProducts>() {
            @Override
            public int compare(CombineProducts o1, CombineProducts o2) {
                return o2.frequency - o1.frequency;
            }
        });
        return res.get(0).toString();
    }

    private List<CombineProducts> getCombineListFromLine(String line) {
        List<String> productsList = getProductsFromLine(line);
        List<CombineProducts> combineProducts = new ArrayList<>();
        for (int i = 0; i < productsList.size() - 1; i++) {
            for (int j = i + 1; j < productsList.size(); j++) {
                combineProducts.add(new CombineProducts(productsList.get(i), productsList.get(j), 1));
            }
        }
        return combineProducts;
    }

    private List<String> getProductsFromLine(String line) {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ',') {
                list.add(stringBuilder.toString());
                stringBuilder = new StringBuilder("");
            } else {
                stringBuilder.append(line.charAt(i));
            }
        }
        list.add(stringBuilder.toString());
        return list;
    }

    private class CombineProducts {
        String product1;
        String product2;
        int frequency;

        public CombineProducts(String product1, String product2, int frequency) {
            this.product1 = product1;
            this.product2 = product2;
            this.frequency = frequency;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CombineProducts) {
                CombineProducts combineProducts = (CombineProducts) obj;
                return (Objects.equals(this.product1, combineProducts.product1)
                        && Objects.equals(this.product2, combineProducts.product2)
                        || Objects.equals(this.product1, combineProducts.product2)
                        && Objects.equals(this.product2, combineProducts.product1));
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return product1 + ',' + product2;
        }
    }
}
