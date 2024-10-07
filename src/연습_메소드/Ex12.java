package 연습_메소드;

public class Ex12 {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    public static void printPay(double a, int b) {
        double 월급 = a * b;
        if(b > 60){
            System.out.println("근무시간 초과 에러");
        }else if (a < 8.00) {
            System.out.println("최저시급 에러");
        }else if(b>40){
            System.out.printf("$ %.2f\n", 40*a+(b-40)*a*1.5);
        }
        else{
            System.out.printf("$ %.2f\n", 월급);

        }
    }
}
