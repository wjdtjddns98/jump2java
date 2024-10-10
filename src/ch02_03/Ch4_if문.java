package ch02_03;

import java.util.ArrayList;

public class Ch4_if문 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;
        if (money >= 3000 || hasCard && hasCard ) {
            System.out.println("택시를 타고 간다");
        } else {
            System.out.println("걸어간다");
        }
        // if 조건에 리스트 contains
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("papper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money")){
            System.out.println("택시를 타고간다");
        }else {
            System.out.println("걸어가라");
        }
    }
}
