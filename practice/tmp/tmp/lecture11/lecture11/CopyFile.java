package lecture11.lecture11;

import java.io.*;

class CopyFile {
    public static void copyFile(InputStream src, OutputStream dest) {
        try {
            int data;
            while ((data = src.read()) != -1) { dest.write(data); }
        }
        catch (Exception e) { e.printStackTrace(); }
    }

    public static void main(String[] args) {
        try {
            String srcFileName = "hello.txt";
            String destFileName = "hello2.txt";
            FileInputStream src = new FileInputStream(srcFileName);
            FileOutputStream dest = new FileOutputStream(destFileName);
            copyFile(src, dest);
            src.close();
            dest.close();

            FileReader fr = new FileReader(destFileName);
            BufferedReader src3 = new BufferedReader(fr);
            String line;
            while ((line = src3.readLine()) != null) {
                System.out.println(line);
            }
            src3.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}