package 연습_클래스;

import java.util.Random;

public class HeroTest {
    public static void main(String[] args) {
        Hero zed = new Hero("제드");
        Hero yi = new Hero("마이");

        Hero.battle(zed, yi);
    }
}

class Hero{
    String name;
    int hp;
    public Hero(String name){
        this.name = name;
        hp = 100;
    }

    public void attack(Hero enemy){
        Random random = new Random();
        int dmg = random.nextInt(10)+1;
        enemy.hp -= dmg;
    }

    public static void battle(Hero a, Hero b){
        boolean firstAttack = true;
        while (b.hp > 0) {
            if (firstAttack) {
                a.attack(b);
                System.out.printf("[%s]의 공격%n", a.name);
                System.out.printf("%s: %d/100%n", a.name, b.hp);
            } else {
            }
            firstAttack = !firstAttack;
        }
    }

}
