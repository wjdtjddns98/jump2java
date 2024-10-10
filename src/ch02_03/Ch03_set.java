package ch02_03;

import java.util.Arrays;
import java.util.HashSet;

public class Ch03_set {
    public static void main(String[] args) {
        //set은 리스트 중에 반볼되지 않는다
        HashSet<String> set =
        new HashSet<>(Arrays.asList("h","e","l","l","o"));
        System.out.println(set);

        //교집합 구하기

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        HashSet<Integer> intersection = new HashSet<>(s1); //s1으로 교집합 생성
        intersection.retainAll(s2); //교집합 수행
        System.out.println(intersection);

        //합집합 구하기
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        //차집합 구하기
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);

        //메소드 add, addAll , Remove

        HashSet<String> s3 = new HashSet<>();
        s3.add("Jump");
        s3.add("To");
        s3.add("Java");
        System.out.println(s3);

        HashSet<String> s4 = new HashSet<>();
        s4.addAll(s3);
        s4.addAll(Arrays.asList("And","Home"));
        System.out.println(s4);

        s4.remove("Home");
        System.out.println(s4);



    }
}
