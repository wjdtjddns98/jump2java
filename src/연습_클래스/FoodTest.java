package 연습_클래스;

class Food {
    // 1. 필드를 추가하세요.
    String name;
    int price;

    // 2. 생성자를 추가하세요.
    Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 3. toString() 메서드를 수정하세요.

    public String toString() {
        return "Food{name: " + name + ", price: " + price + "원}";
    }
}

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Food("치킨", 18000);
        Food pizza = new Food("피자", 28000);
        Food sushi = new Food("초밥세트", 22000);

        Food[] foods = { chicken, pizza, sushi};

        for(int i=0; i<foods.length; i++) {
            System.out.println(foods[i].toString());
        }
    }
}
