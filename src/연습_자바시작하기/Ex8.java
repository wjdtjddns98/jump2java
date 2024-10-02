package 연습_자바시작하기;

public class Ex8 {
    public static void main(String[] args) {
        int totalSec = 7582;
        int min = (totalSec/60)%60;
        int sec = totalSec%60;
        int hour = totalSec/3600;

        System.out.printf("%d시간%d분%d초\n", hour, min, sec );
    }
}
