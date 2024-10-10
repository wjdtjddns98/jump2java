package ch05_8;

abstract class Animal {
    int a = 0;
    String k = "동물";

    public abstract void color();
    public abstract void height();

    public void printName(String name){
        System.out.println(name);
    }
}
//추상 클래스를 상속받은 클래스는 추상메서드를 구현해야함


public class Ch05_8 {

}
