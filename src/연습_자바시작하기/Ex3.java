package 연습_자바시작하기;

public class Ex3 {
    public static void main(String[] args) {
        Double M = 8.62;
        Double T = 10.23;
        Double W = 12.48;
        Double Th = 7.82;
        Double F = 9.54;

        Double Hab = M+T+W+Th+F;

        System.out.printf("$ %.2f", Hab);
    }
}
