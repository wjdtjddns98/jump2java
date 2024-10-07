public class Ch03_상수집합 {

    enum CoffeType {
        아메리카노,
        아이스아메리카노,
        카페라테
    }

    public static void main(String[] args) {
        System.out.println(CoffeType.아메리카노);
        System.out.println(CoffeType.아이스아메리카노);
        System.out.println(CoffeType.카페라테);

        //반복문

        for (CoffeType c : CoffeType.values()) {
            System.out.println(c);
        }


    }
}
