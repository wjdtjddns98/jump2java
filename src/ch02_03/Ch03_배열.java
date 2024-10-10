package ch02_03;

public class Ch03_배열 {
    public static void main(String[] args) {
        //자료형의 집합을 의미
        //정수 int 배열
        int[] odds = {1, 3, 5, 7, 9}; //리터럴 방식{} 중괄호 안에 넣는다
        //문자열 String 배열
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        //배열을 객체로 만들기 ( new 키워드)

        String[] weeks2 = new String[7];    //배열의 길이를 정함(초기값이 없음)
        weeks2[0] = "월";
        weeks2[1] = "화";
        weeks2[2] = "수";
        weeks2[3] = "목";
        weeks2[4] = "금";
        weeks2[5] = "토";
        weeks2[6] = "일";

        //배열값에 접근하기 목요일 값은 (0,1,2,3)
        System.out.println(weeks2[3]);
        System.out.println(weeks[3]);

        //반복문을 사용해서 배열의 전체 값들을 출력]
        for (int i = 0; i < weeks2.length; i++) {
            System.out.println(weeks2[i]);
        }
    }
}
