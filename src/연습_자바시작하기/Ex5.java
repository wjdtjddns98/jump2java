package 연습_자바시작하기;

public class Ex5 {
    public static void main(String[] args) {
        int euro = 52;
        int dollar = 32;

        double Euro = 1281.62664;
        double Dollor = 1091.70306;

        double kwn = Euro*euro + Dollor*dollar;

        System.out.printf("환전결과 : %.0f원", kwn);
    }
}
