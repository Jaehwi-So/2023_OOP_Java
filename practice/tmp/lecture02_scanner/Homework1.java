package lecture02_scanner;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            System.out.print("정수를 입력하세요 : ");
            array[i] = sc.nextInt();
            sum += array[i];
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }
    }
}
