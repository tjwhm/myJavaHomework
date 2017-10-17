package e01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ����Ŀǰ����һ��������ͬѧ�ǿ��Ը���ʵ����Ҫ���ӷ��������������࣬�������ӵ�������Analysis ����ͬһ��Ŀ¼
 *
 * @author Administrator
 */
public class Analysis {

    /**
     * content���� ��red.txt �ú���Ҫ�����¹��� 1 ���ݵ�x�� (��һ�� ..��һ�����) ���ı���ֳ� 120�� 2
     * ͳ��ÿ����������ַ�c��Ƶ�� 3 ��ÿ�س���c��Ƶ�ʷŵ��������� 4 ����Ҫ�����ļ��е�һЩ�����ַ� ���磺 �ֻ������顤��ѧ��С˵��
     * ����ʱ��:2006-7-26 11:43:00 ��������:8717 [��¥�� / ��ѩ�� �� ]
     * �ֻ������顤��ѧ��С˵��Txt���Ķ�,�Ķ���Ʒ���������:http://www.dxsxs.com�� �鼮����: �й��Ŵ��Ĵ�����֮һ....
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
                        && line.charAt(i) == '��'
                        && line.charAt(i + 1) == getChineseCharacter(chapter / 100)
                        && line.charAt(i + 2) == getChineseCharacter(chapter % 100 / 10)
                        && line.charAt(i + 3) == getChineseCharacter(chapter % 10)
                        && line.charAt(i + 4) == '��') {
                    i += 4;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter > 19
                        && line.charAt(i) == '��'
                        && line.charAt(i + 1) == getChineseCharacter(chapter / 10)
                        && line.charAt(i + 2) == 'ʮ'
                        && line.charAt(i + 3) == getChineseCharacter(chapter % 10)
                        && line.charAt(i + 4) == '��') {
                    i += 4;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter % 10 == 0
                        && line.charAt(i) == '��'
                        && line.charAt(i + 1) == getChineseCharacter(chapter / 10)
                        && line.charAt(i + 2) == 'ʮ'
                        && line.charAt(i + 3) == '��') {
                    i += 3;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter > 10
                        && line.charAt(i) == '��'
                        && line.charAt(i + 1) == 'ʮ'
                        && line.charAt(i + 2) == getChineseCharacter(chapter % 10)
                        && line.charAt(i + 3) == '��') {
                    i += 3;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter == 10
                        && line.charAt(i) == '��'
                        && line.charAt(i + 1) == 'ʮ'
                        && line.charAt(i + 2) == '��') {
                    i += 2;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (chapter != 1
                        && line.charAt(i) == '��'
                        && line.charAt(i + 1) == getChineseCharacter(chapter)
                        && line.charAt(i + 2) == '��') {
                    i += 2;
                    chaptersCounts.add(chapterZhi);
                    chapterZhi = 0;
                    ++chapter;
                } else if (line.charAt(i) == '��'
                        && line.charAt(i + 1) == 'һ'
                        && line.charAt(i + 2) == '��') {
                    i += 2;
                    ++chapter;
                }
                if (line.charAt(i) == '֮') {
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
            return '��';
        } else if (i == 1) {
            return 'һ';
        } else if (i == 2) {
            return '��';
        } else if (i == 3) {
            return '��';
        } else if (i == 4) {
            return '��';
        } else if (i == 5) {
            return '��';
        } else if (i == 6) {
            return '��';
        } else if (i == 7) {
            return '��';
        } else if (i == 8) {
            return '��';
        } else {
            return '��';
        }
    }
}
