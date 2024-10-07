package 연습_메소드;

public class Ex11 {
    public static void main(String[] args) {
        String x = rating(4.2, 4.7, 4.3);
        String y = rating(3.8, 4.1, 3.5);
        String z = rating(3.6, 3.0, 3.4);

        System.out.printf("X -> %s등급\n", x);
        System.out.printf("Y -> %s등급\n", y);
        System.out.printf("Z -> %s등급\n", z);
    }

    private static String rating(double a, double b, double c) {
        String result = "";
        double sum = a + b + c;

        if (a > 4.0 && b > 4.0 && c > 4.0) {
            result = "A";
        } else if (a + b + c > 10 && a > 4.0 || b > 4.0 || c > 4.0) {
            result ="B";
        } else
            result= "C";


        return result;
    }

}

