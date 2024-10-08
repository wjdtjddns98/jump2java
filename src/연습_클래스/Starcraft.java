package 연습_클래스;

import java.sql.SQLOutput;

public class Starcraft {
    public static void main(String[] args) {
        Marine marine = new Marine("마린", 80);
        Medic medic = new Medic("메딕", 60);
        // 마린 스팀팩
        marine.stimpack();
        //메딕 힐 > 마린
        medic.heal(marine);

    }
}

//마린 클래스

class Marine{
    String name;
    int hp;
    //생성자
    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    // 메소드
    public void stimpack() {
        System.out.printf("[%s]의 스팀팩 ! HP: %d ->", name, hp);
        hp -=10;
        System.out.printf("%d\n",hp);
    }
}

//메딕 클래스

class Medic{
    //필드
    String name;
    int hp;
    //생성자
    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //메소드
    public void heal(Marine target) {
        System.out.printf("[%s]의 치유! [%s] hp: %d ->", name, target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d\n",target.hp);
    }
}