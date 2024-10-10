package ch02_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ch03_List {
    public static void main(String[] args) {
        //필요한 자료형 타입은 import 해준다
        ArrayList pitches = new ArrayList();
        //item 을 추가할때는 add 메서드를 사용 (@.add)
        pitches.add("138"); //첫번째 아이템 ( 0 )
        pitches.add("129"); //두번째 아이템 ( 1 )
        pitches.add("142"); //세번째 아이템 ( 2 )
        //아이템에 접근 (가져오기)

        System.out.println(pitches.get(1)); //129
        System.out.println(pitches.get(2));

        //사이즈(배열의 크기) 몇개냐 ?(배열은 .length)

        System.out.println(pitches.size());
        //contains : 아이템이 있으면 참 , 없으면 거짓
        System.out.println(pitches.contains("142"));
        //remove : 삭제하기 ( 아이템 or 인덱스 )
        System.out.println(pitches.remove("129")); //삭제
        System.out.println(pitches.remove(0)); //삭제

        System.out.println(pitches);

        //제네릭 : 자료형을 안전하게 사용할 수 있도록 미리 타입을 정함
        //정수형 리스트를 만들어보자
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.remove(0));
        System.out.println(numbers);

        //배열을 리스트로 변환하기
        String[] data = {"월","화", "수"};
        //Array의 asList(배열) 로 변환
        ArrayList<String> weeks = new ArrayList(Arrays.asList(data));
        weeks.add("목");
        weeks.add("금");
        System.out.println(weeks);

        //아이템 직접 입력하기
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(n);

        //리스트 아이템들을 문자열로 String.join 합치기
        String result = String.join(":", weeks);
        System.out.println(result);

        //리스트 정렬하기
        n.sort(Comparator.reverseOrder()); // 역순 정렬
        System.out.println(n);

        weeks.sort(Comparator.naturalOrder()); // 정방향 정렬
        System.out.println(weeks); //한글은 가나다 순으로 정렬, 영어는 알파벳 순으로 정렬



    }
}
