package c07.h01;

/*
  Created by tjwhm on 2017/10/3 13:16
  Happy coding !
 */
public class MyUtil {
    public String getFilename(String fullPathname) {
        String res = null;
        for (int i = fullPathname.length() - 1; i > -1; i--) {
            if ('/' == fullPathname.charAt(i)) {
                res = fullPathname.substring(i + 1, fullPathname.length());
                break;
            }
        }
        return res;
    }

    public String getStudentID(String fullPathname) {
        String fileName = getFilename(fullPathname);
        return fileName.substring(0, 10);
    }

    public String getStudentName(String fullPathname) {
        String fileName = getFilename(fullPathname);
        int index = 0;
        for (int i = 0; i < fileName.length(); i++) {
            if ('.' == fileName.charAt(i)) {
                index = i;
            }
        }
        return fileName.substring(11, index);
    }

    public void zipSpace(StringBuffer buf) {
        for (int i = 0; i < buf.length(); i++) {
            if (' ' == buf.charAt(i)) {
                buf.deleteCharAt(i);
                i--;
            }
        }
    }

    public boolean containsUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
