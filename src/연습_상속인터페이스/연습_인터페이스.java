package 연습_상속인터페이스;

import java.util.ArrayList;

public class 연습_인터페이스 {
    public static void main(String[] args) {
        Sounding dog = new Dog();
        Sounding baby = new Baby();
        Sounding tiger = new Tiger();
        Sounding robot = new Robot();

        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }
    }
}

interface Sounding{
    public void sound();
}

class Dog implements Sounding{
    public void sound() {
        System.out.println("Dog : 멍멍 !");
    }
}

class Baby implements Sounding{
    public void sound() {
        System.out.println("Baby : 응애 ㅋ");
    }
}

class Tiger implements Sounding {
    public void sound() {
        System.out.println("Tiger : 야옹 ");
    }
}

class Robot implements Sounding {
    public void sound() {
        System.out.println("Robot : 어흥");
    }
}
