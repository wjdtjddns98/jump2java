package ch05;

//별도의 계산기 클래스
class Calculator{
    int result = 0; //변수
    //클래스 안의 함수를 메소드라고 한다

    /**
     * 정수를 입력해 더해준 결과값을 리턴한다
     * @param num 입력정수
     * @return result 결과
     */

    int add(int num) {
        result += num;
        return result;
    }
}

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }

}

public class Ch05_객체지향 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal fox = new Animal();
        dog.setName("강아지");
        cat.setName("야옹이");
        fox.setName("여우");
        System.out.println(cat.name);
        System.out.println(dog.name);
        System.out.println(fox.name);
        //클래스로 만든 객체를 인스턴스라고 한다
    }

}
