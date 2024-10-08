package 연습_클래스;

import javax.swing.plaf.PanelUI;
import java.awt.*;

public class ChinesRestaurant {
    public static void main(String[] args) {
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);

        //메뉴를 조합하여 order을 생성
        Menu[] menuArr = { jjajang, jjambbong, tangsook};
        Order order = new Order(520, menuArr);

        //주문 결과 출력
        System.out.printf("주문합계:%d원\n",order.totalPrice());

    }
}

class Order{
    int orderNum;
    Menu[] menus;

    public Order(int i, Menu[]arr) {
        orderNum = i;
        menus = arr;
    }

    public int totalPrice() {
        int total = 0;
        for(Menu a : menus) {
            total += a.price;
        }
        return total;
    }
}

class Menu{
    String name;
    int price;

    public Menu(String str, int i) {
        name = str;
        price = i;
    }
}