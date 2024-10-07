package ch05;

class Sample {
    //메서드 입력 매개 변수
    int sum(int a, int b) {
        return a * b;
    }
    //입력값은 없고 문자열 " sex " 가 반환됨.
    String say(){
        return "sex";
    }
    //리턴값이 없는 메서드
    void hello(){
        System.out.println("\nhello");}
    void sum2(int a, int b) {
        System.out.println(a+"과"+ b+"의 합은"+(a+b)+"입니다.");
        System.out.printf("%d와 %d의 합은 %d 입니다",a,b,a+b);
    }
    //리턴으로 빠져나오기(메서드에서 리턴을 만나면 종료됨)
    void sayNick(String nick){
        if("바보".equals(nick)||"등신".equals(nick)){
        return; //종료
        }
        System.out.println("나의 별명은"+ nick +"입니다");
    }
    //메서드 안에 선언 변수 효력 범위 (메서드 안에서만 사용)

    int varTest(int a){

        a++;
        return a;
    }
}

public class Ch05_메서드 {


    public static void main(String[] args) {

       Sample sample = new Sample();
       //객체.메소드명 => 메소드 호출/이때 전달하는 입력 값을 인수 라고 한다
       int c = sample.sum(3,4);

       System.out.println(c);
       String say = sample.say();
       System.out.println(say);
       sample.sum2(9,110);
       sample.hello();
       sample.sayNick("야호");
       sample.sayNick("바보");

       int a = 1;
       a = sample.varTest(a);
       System.out.println(a);
    }
}
//리턴자료형 메서드명(입력자료형 매개변수, 입력자료형 매개변수....)
//return 리턴값;
