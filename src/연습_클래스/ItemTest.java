package 연습_클래스;

public class ItemTest {
    public static void main(String[] args) {
        //아이템 객체 생성

        Item storm = new Item("스톰브레이커", 600);
        Item gauntlet = new Item("인피니티 건틀렛", 999);
        Item bow = new Item("호크아이의 활", 50);
        Item shield = new Item("캡아의 방패", 50);

        Item[] items = {storm,gauntlet,bow,shield};
        for(int i=0; i<items.length; i++) {
            System.out.println(items[i].toString());
        }
    }
}

class Item {
    //필드
    String name;
    int power;


    public Item(String str, int i) {
        name = str;
        power = i;
    }

    public String toString() {
        return String.format("%s: %d", name, power);
    }
}
