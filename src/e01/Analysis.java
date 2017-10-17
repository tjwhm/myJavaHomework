package e01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 类中目前仅有一个方法，同学们可以根据实际需要增加方法，甚至增加类，但是增加的类必须和Analysis 处在同一个目录
 *
 * @author Administrator
 */
public class Analysis {

    /**
     * content内容 见red.txt 该函数要做如下工作 1 根据第x回 (第一回 ..第一二零回) 将文本拆分成 120段 2
     * 统计每段里面出现字符c的频率 3 把每回出现c的频率放到数组里面 4 不需要考虑文件中的一些干扰字符 例如： 手机电子书·大学生小说网
     * 更新时间:2006-7-26 11:43:00 本章字数:8717 [红楼梦 / 曹雪芹 著 ]
     * 手机电子书·大学生小说网Txt版阅读,阅读作品更多请访问:http://www.dxsxs.com， 书籍介绍: 中国古代四大名著之一....
     *
     * @return
     * @throws IOException
     */
    public int[] analysisRed(String filename) throws IOException {
        InputStream is = new FileInputStream(filename);
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, "gbk"));
        line = reader.readLine();
        List<Integer> chaptersCounts = new ArrayList<>();
        int chapter = 1;
        int chapterZhi = 0;
        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                if (chapter > 99
                        && line.charAt(i) == '第'
                        && line.charAt(i + 1) == getChineseCharacter(chapter / 100)
                        && line.charAt(i + 2) == getChineseCharacter(chapter % 100 / 10)
                        && line.charAt(i + 3) == getChineseCharacter(chapter % 10)
                        && line.charAt(i + 4) == '回') {
                    i += 4;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter > 19
                        && line.charAt(i) == '第'
                        && line.charAt(i + 1) == getChineseCharacter(chapter / 10)
                        && line.charAt(i + 2) == '十'
                        && line.charAt(i + 3) == getChineseCharacter(chapter % 10)
                        && line.charAt(i + 4) == '回') {
                    i += 4;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter % 10 == 0
                        && line.charAt(i) == '第'
                        && line.charAt(i + 1) == getChineseCharacter(chapter / 10)
                        && line.charAt(i + 2) == '十'
                        && line.charAt(i + 3) == '回') {
                    i += 3;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter > 10
                        && line.charAt(i) == '第'
                        && line.charAt(i + 1) == '十'
                        && line.charAt(i + 2) == getChineseCharacter(chapter % 10)
                        && line.charAt(i + 3) == '回') {
                    i += 3;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter == 10
                        && line.charAt(i) == '第'
                        && line.charAt(i + 1) == '十'
                        && line.charAt(i + 2) == '回') {
                    i += 2;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter != 1
                        && line.charAt(i) == '第'
                        && line.charAt(i + 1) == getChineseCharacter(chapter)
                        && line.charAt(i + 2) == '回') {
                    i += 2;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (line.charAt(i) == '第'
                        && line.charAt(i + 1) == '一'
                        && line.charAt(i + 2) == '回') {
                    i += 2;
                    ++chapter;
                }
                if (line.charAt(i) == '之') {
                    ++chapterZhi;
                }
            }
            line = reader.readLine();
        }
        chaptersCounts.add(chapterZhi);
        int[] counts = new int[chaptersCounts.size()];
        for (int i = 0; i < chaptersCounts.size(); i++) {
            counts[i] = chaptersCounts.get(i);
        }
        return counts;
    }


    private Character getChineseCharacter(int i) {
        if (i == 0) {
            return '零';
        } else if (i == 1) {
            return '一';
        } else if (i == 2) {
            return '二';
        } else if (i == 3) {
            return '三';
        } else if (i == 4) {
            return '四';
        } else if (i == 5) {
            return '五';
        } else if (i == 6) {
            return '六';
        } else if (i == 7) {
            return '七';
        } else if (i == 8) {
            return '八';
        } else {
            return '九';
        }
    }
}
