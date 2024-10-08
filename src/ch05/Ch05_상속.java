package ch05;

//부모클래스
class Ani{
    String name;
    void setName(String name){
        this.name = name;
    }
}

//자식클래스 Ani 클래스를 상속 (extends)
class Dog extends Ani{

    //생성자는 클래스 명과 똑같고 리턴이 없음
    //그 중에 디폴트생성자는 입력변수가 없음
    void sleep(){
        System.out.println(this.name + "zzz");
    }
}

class HouseDog extends Dog{
    @Override
    void

    sleep(){
        System.out.println(this.name + "zzz in home");
    }

    void sleep(int hour){
        System.out.println(this.name + hour + "hour sleep");

    }
}


public class Ch05_상속 {
    public static void main(String[] args) {
       Dog d = new Dog();
        d.setName("뽀삐");
        System.out.println(d.name);
        d.sleep();

        Ani a = new Dog();

        //메서드 오버라이딩 : 부모 메서드와 똑같은 이름의 메서드를 새로 만듬
        HouseDog h = new HouseDog();
        h.setName("니미");
        h.sleep();
        //이름은 같지만 입력 변수가 틀림 ( 메서드 오버로딩)
        h.sleep(10);
    }

}

