package ch02_03;

public class Ch03_정수 {
    public static void main(String[] args) {
        //정수타입(정수 자료형)
        int age = 10;
        long count = 6516461231231231235L;
        //실수 자료형(double이 기본)
        float pi = 3.14f;
        double pi2 = 3.14159265358979323846;
        int oxtal = 023;
        int hex = 0xC3;
        System.out.println(oxtal);
        System.out.println(hex);
        //숫자연산 ( + - * / ) 사칙연산

        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(7%3);
        System.out.println(3%7);

        //증감 연산 ( ++ , -- ) 1씩 증가 , 감소
        int i = 0;
        int j = 10;
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);
        //증감 연산자가 앞에 있을때 먼저 증감 뒤에는 뒤에 증감
        System.out.println(++i);
        System.out.println(j--);
        System.out.println(j);

        int x = i++;    // x= 2, i = 3
        int y = i + --j; // y = 10 , i = 3 , j = 7
        System.out.println(x);
        System.out.println(y);
        System.out.println(i);
        System.out.println(j);
    }
}
