package 연습_자바시작하기;

public class Ex12 {
    public static void main(String[] args) {
        int num = 374;
        int onedigit = num % 10;
        int twodigit = num % 100 / 10;
        int threedigit = num / 100;
        System.out.println(onedigit+twodigit+threedigit);
    }
}
