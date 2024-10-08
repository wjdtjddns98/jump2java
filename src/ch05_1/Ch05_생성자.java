package ch05_1;

class Animal{
    Animal(){
        System.out.println("동물 객체 생성");
    }

    String name;
    void setName(String name){
        this.name = name;
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("강아지 객체 생성");
    }
    void sleep(){
        System.out.println(this.name+" zzz");
    }
}

class Housedog extends Dog{
   //이름을 처음부터 입력하는 생성자
    Housedog(String name){
        this.setName(name);
    }
    Housedog(int type){
        if(type == 1){
            this.setName("요크셔");
        }else if(type == 2){
            this.setName("말티즈");
        }
    }

    @Override
    void sleep() {
        System.out.println(this.name+"집잠");
    }
}
public class Ch05_생성자 {
    public static void main(String[] args) {
        Dog d = new Dog(); //디폴트 생성자
        Housedog h1 = new Housedog("해피");
        Housedog h2 = new Housedog(1);
        System.out.println(h1.name);
        System.out.println(h2.name);
    }
}
