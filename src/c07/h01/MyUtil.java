package c07.h01;

/*
  Created by tjwhm on 2017/10/3 13:16
  Happy coding !
 */
public class MyUtil {
    public String getFilename(String fullPathname) {
        int i;
        for (i = fullPathname.length() - 1; i > -1; i--) {
            if ('/' == fullPathname.charAt(i)) {
                break;
            }
        }
        return fullPathname.substring(i + 1, fullPathname.length());
    }

    public String getStudentID(String fullPathname) {
        String fileName = getFilename(fullPathname);
        int end = 0;
        for (int i = 0; i < fileName.length(); i++) {
            if (fileName.charAt(i) == '_') {
                end = i;
            }
        }
        return fileName.substring(0, end);
    }

    public String getStudentName(String fullPathname) {
        String fileName = getFilename(fullPathname);
        String studentID = getStudentID(fullPathname);
        int index = 0;
        for (int i = 0; i < fileName.length(); i++) {
            if ('.' == fileName.charAt(i)) {
                index = i;
            }
        }
        return fileName.substring(studentID.length() + 1, index);
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
