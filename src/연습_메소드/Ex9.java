package 연습_메소드;

public class Ex9 {
    public static void main(String[] args) {
        printAnimal(1986);
        printAnimal(1990);
        printAnimal(2001);
    }

    public static void printAnimal(int 생일) {
        String 간지 = "";
        switch (생일 % 12) {
            case 0:
                간지 = "원";
                break;
            case 1:
                간지 = "닭";
                break;
            case 2:
                간지 = "개";
                break;
            case 3:
                간지 = "돼지";
                break;
            case 4:
                간지 = "쥐";
                break;
            case 5:
                간지 = "소";
                break;
            case 6:
                간지 = "호랑이";
                break;
            case 7:
                간지 = "토끼";
                break;
            case 8:
                간지 = "용";
                break;
            case 9:
                간지 = "뱀";
                break;
            case 10:
                간지 = "말";
                break;
            case 11:
                간지 = "양";
                break;
            default:
                간지 = "ERROR";
                break;
        }
        System.out.printf("%d년 =>%s띠\n",생일, 간지);

    }
}
