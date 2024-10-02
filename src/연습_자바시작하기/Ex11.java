package 연습_자바시작하기;

public class Ex11 {
    public static void main(String[] args) {
        double height = 81.36;
        double height2 = height + 0.71;
        double height3 = height - 0.43;
        System.out.printf("%.2f kg", (height+height2+height3)/3);
    }
}
