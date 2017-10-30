package e03;

import java.io.*;
import java.util.*;

public class MyTools {

    private String studentListFile;
    private String picDir;

    public MyTools(String studentListFile, String picDir) {
        this.studentListFile = studentListFile;
        this.picDir = picDir;
    }

    public Set<String> getNoPicStudentList() {
        InputStream is = null;
        try {
            is = new FileInputStream(studentListFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        BufferedReader reader = null;
        try {
            if (is != null) {
                reader = new BufferedReader(new InputStreamReader(is, "gbk"));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            if (reader != null) {
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> ids = new ArrayList<>();
        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                if (!(line.charAt(i) >= '0' && line.charAt(i) <= '9')) {
                    ids.add(line.substring(0, i));
                    break;
                }
            }
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File[] files = new File(picDir).listFiles();
        List<String> picIDs = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                picIDs.add(getStudentID(file.getName()));
            }
        }
        List<String> gonnaDelete = new ArrayList<>();
        for (String s : ids) {
            for (String s1 : picIDs) {
                if (Objects.equals(s, s1)) {
                    gonnaDelete.add(s);
                }
            }
        }

        ids.removeAll(gonnaDelete);

        Set<String> res = new TreeSet<>();
        res.addAll(ids);
        return res;
    }

    public Set<String> getOverSizeStudentList() {
        File[] files = new File(picDir).listFiles();
        Set<String> strings = new TreeSet<>();
        if (files != null) {
            for (File file : files) {
                if (file.length() > 128 * 1024) {
                    strings.add(getStudentID(file.getName()));
                }
            }
        }
        return strings;
    }

    private String getStudentID(String fileName) {
        int end = 0;
        for (int i = 0; i < fileName.length(); i++) {
            if (fileName.charAt(i) == '_') {
                end = i;
            }
        }
        return fileName.substring(0, end);
    }
}
