package 연습_메소드;

public class Ex4 {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice() ;
        double won = exchange(dollar);
        System.out.printf("획득금액: $%.2f(%.0f원) ",dollar,won);

    }

    private static double exchange(double dollar) {
        return 1082.25108* dollar ;
    }

    private static int dice() {
        return (int) (Math.random() * 6) +1;

    }
}
