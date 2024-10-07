package 연습_메소드;


public class Ex7 {
    public static void main(String[] args) {
        double tomVocal = 8.8;
        double tomDance = 7.6;
        double KateVocal = 9.2;
        double KateDance = 7.8;
        System.out.printf("Tom의 오디션 결과 : %s\n", sum(tomVocal, tomDance));
        System.out.printf("Kate의 오디션 결과 : %s\n", sum(KateVocal, KateDance));
    }

    static String sum(double a, double b) {
        if ( a  * b > 70.0 ) {
            return "합격";
        }else {
            return "불합격";
        }
    }

}
