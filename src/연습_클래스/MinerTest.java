package 연습_클래스;

//출력 예 Miner{name:말런,coins:3}
//       Miner{name:글로리아,coins:2}

public class MinerTest {
    public static void main(String[] args) {
        Miner malon = new Miner("말론");
        Miner gloria = new Miner("글로리아");

        for(int i =0; i < 15; i++) {
            malon.mine();
        }
        for(int i =0; i < 55; i++) {
            gloria.mine();
        }

        // 객체 정보를 출력한다
        System.out.println(malon);
        System.out.println(gloria);
    }
}


class Miner {
    String name;
    int coins;

    public Miner(String str){
        name = str;
        coins = 0;
    }

    public String toString(){
        return String.format("%s: %d coins", name, coins);
    }

    public void mine() {
        coins +=1;
    }
}