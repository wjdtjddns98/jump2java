public class ch02_2_변수와_자료형 {
    public static void main(String[] args) {
        int a; //변수의 선언 : 정수형 변수 a를 만듬
        String b; //문자열 변수 b를 만듬
        //변수의 값을 초기화
        a = 1; //a 의 값
        b = "hello"; //b 의 값

        System.out.println(a);
        System.out.println(b);
        //변수는 값을 바꿀수 있다.
        a = 777777;
        b = "헬로우";
        char c = '가';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
