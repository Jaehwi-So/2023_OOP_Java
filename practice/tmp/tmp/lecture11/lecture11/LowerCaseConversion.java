package lecture11.lecture11;

import java.io.BufferedReader;
import java.io.FileReader;

public class LowerCaseConversion {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("hello.txt");
            BufferedReader f = new BufferedReader(fr);
            int data;

            while ((data = f.read()) != -1) {
                char ch = Character.toLowerCase((char) data);
                System.out.print(ch);
            }
            f.close();
        }
        catch (Exception e) {  e.printStackTrace(); }
    }
}