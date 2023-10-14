import java.util.Scanner;

public class Homework4 {

    //재귀호출 이용
    int gcd(int m, int n){
        if(n == 0){
            return m;
        }
        else if(m % n == 0){
            return n;
        }
        else{
            return gcd(n,m % n);
        }
    }

    //반복문 이용
    int gcdByLoop(int m, int n){
        while(true){
            if(n == 0){
                return m;
            }
            else if(m % n == 0){
                return n;
            }
            else{
                m = m % n;
                int tmp = m;
                m = n;
                n = tmp;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요:");
        int i = sc.nextInt();
        int j = sc.nextInt();

        Homework4 foo = new Homework4();

        //재귀함수 이용
        int result = foo.gcd(i, j);
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");


        //반복문 이용
        int result2 = foo.gcdByLoop(i, j);
        System.out.println("두 수의 최대공약수는 " + result2 + "입니다.");

    }
}
