package 연습_메소드;

public class Ex1 {
    public static void main(String[] args) {
        // 칼로리 계산을 위한 메소드 호출
        double result = calculateCalory(5000) ;
        //결과 출력
        System.out.println("소모칼로리 :"+result+" kcal");

    }
    //칼로리 계산 메소드를 정의
    public static double calculateCalory(int walk){
        return 0.02 * walk;
    }
}
