package lecture11.lecture11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class TestBufferedWriter {
    public static void main(String[] args) {
        String fileName = "db.txt";

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(fileName));
            bf.write("I love to travel.\r\n");
            bf.write("The cities I have visited:\r\n");
            bf.write("\t- Seoul\r\n");
            bf.write("\t- New York\r\n");
            bf.write("\t- Sydney\r\n");
            bf.close();

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}