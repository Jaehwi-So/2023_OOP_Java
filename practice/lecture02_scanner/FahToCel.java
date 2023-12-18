package lecture02_scanner;

import java.util.Scanner;


/**
 * • 문제
 * – 사용자로부터 화씨 온도를 입력 받고, 섭씨 온도로 변환한 후에 화면에 출력하는 프로그램을 작성 – 섭씨(Celsius)/화씨(Fahrenheit) 변환 공식
 *  fahrenheit = celsius * (9 / 5) + 32 celsius = (5 / 9) * (fahrenheit - 32)
 * • 요구사항
 * – 사용자가 입력하는 화씨 온도는 실수 값
 * – 변환된섭씨온도는소수첫째자리까지만출력
 * – 사용자는 화씨 온도를 제대로 입력할 것이라고 가정
 */
public class FahToCel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float fahrenheit = sc.nextFloat();
        float celsius = ((float)5 / 9) * (fahrenheit - 32); //정수 나눗셈 -> 하나 형변환 해야 실수로 인지
        double celsius2 = (5.0 / 9.0) * (fahrenheit - 32);  //혹은 실수로 나눗셈 -> double에 넣기
        System.out.printf("화씨 %.1f -> 섭씨 %.1f \n", fahrenheit, celsius);   //소수점 1번째 자리
        System.out.printf("화씨 %.1f -> 섭씨 %.1f", fahrenheit, celsius2);   //소수점 1번째 자리
    }
}
