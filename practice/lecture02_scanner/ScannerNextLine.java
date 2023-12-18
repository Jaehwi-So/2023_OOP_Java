package lecture02_scanner;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 입력 버퍼 : 입력 내용을 임시로 저장하는 메모리 공간, 입력 포인터는 어떤 글짜까지 처리했는지 파악하기 위한 것이고, next는 공백이 입력 포인터가 됨
        String str = sc.nextLine(); //nextLine : 공백 문자 포함, next: 공백 문자를 만나면 입력을 끊어서 받음
        System.out.println(str);
    }
}
