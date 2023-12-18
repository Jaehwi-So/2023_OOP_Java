package lecture02_scanner;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foo = sc.next();
        System.out.println(foo);
        int bar = sc.nextInt();
        System.out.println(bar);
    }
}