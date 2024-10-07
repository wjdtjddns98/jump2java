package 연습_메소드;

public class Ex2 {
    public static void main(String[] args) {
        int n = 3;

        double result = calorieCalculator(n);

        System.out.printf("삼겹살 %d 인분 : %.2f kcal", n, result);
    }

    private static double calorieCalculator(int n) {
        return n * 180 * 5.179;
    }
}
