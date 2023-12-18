package lecture04;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args){
        int size;
        int[] array;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.printf("몇개의 수를 입력할 예정인가요? ");
        size = sc.nextInt();
        array = new int[size];

        System.out.printf("수를 입력하세요: ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("최대값:" + max);
        System.out.println("최소값:" + min);


    }
}
