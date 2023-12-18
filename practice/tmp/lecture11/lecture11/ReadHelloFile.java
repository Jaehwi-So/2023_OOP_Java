package lecture11.lecture11;

import java.io.File;
import java.util.Scanner;

public class ReadHelloFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("hello.txt"));
            while (sc.hasNext()) { // 파일에 데이터가 남았는지 확인
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
