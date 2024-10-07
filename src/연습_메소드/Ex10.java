package 연습_메소드;

public class Ex10 {
    public static void main(String[] args) {
        double w = 73.6;
        double t = 1.70;

        double bmi = cal(w, t);

        System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
        System.out.printf("결과 : %s 입니다.\n", result(bmi));
    }

    private static String result(double bmi) {
        if (bmi < 18.5) {
            return "개멸치";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "멸치";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "돼지";
        } else {
            return "씹돼지";
        }
    }

    private static double cal(double w, double t) {
        return w/(t*t);
    }
}
