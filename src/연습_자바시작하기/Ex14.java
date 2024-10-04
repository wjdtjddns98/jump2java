package 연습_자바시작하기;

public class Ex14 {
    public static void main(String[] args) {
        //가격
        int price = 1889250;
        //장 수 계산
        int a = price/50000;
        int b = (price%50000)/10000;
        int c = (price%50000%10000)/5000;
        int d = (price%50000%10000%5000)/1000;
        //할인금액
        int discount = price%1000;
        //총 지폐 수 계산
        int totalCnt = a+b+c+d;

        System.out.printf("5만원 x %d\n", a);
        System.out.printf("1만원 x %d\n", b);
        System.out.printf("5천원 x %d\n", c);
        System.out.printf("천원 x %d\n", d);
        System.out.println("---------\n");
        System.out.printf("총 장수 x %d\n", totalCnt);
        System.out.printf("금액 : %d원\n", price-discount);
        System.out.printf("할인: %d원", discount);



    }
}
