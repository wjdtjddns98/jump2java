package 연습_자바시작하기;

public class Ex13 {
    public static void main(String[] args) {

        double a = -9.81; //가속도
        double t = 5.00; //이동시간
        double v0 = 0.0; //초기속도
        double x0 = 1000;  //초기위치

        double x = 1.0/2 * a * Math.pow(t, 2) + (v0 * t) + x0;


        System.out.printf("%.2f초 후 위치 : %.2fm\n", t, x);

    }
}
