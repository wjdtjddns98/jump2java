import java.util.ArrayList;
import java.util.Arrays;

public class Ch03_형변환과final {
    public static void main(String[] args) {
        String num = "9128";
        int n = Integer.parseInt(num);
        System.out.println(n);
        String num2 = "3.123"; //문자열
        double n2 = Double.parseDouble(num2);
        System.out.println(n2);

        int n3 = 456;
        String num3 = ""+n3; // 문자열 더하기 숫자는 문자열 !
        System.out.println(n3);
        String num4 = String.valueOf(n3);
        String num5 = Integer.toString(n3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num3+3);
        System.out.println(num4+3);
        System.out.println(num5+3);

        //실수를 문자열로 변환

        String num6 = "123.456";
        double n6 = Double.parseDouble(num6);
        System.out.println(n6);
        System.out.println(n6+2);

        //정수와 실수 변환
        int n4 = 10;
        System.out.println(n4+2);
        double d2 = n4;  //정수 > 실수 따로 캐스팅 필요없음
        System.out.println(d2+2);

        double d3 = 12.3123;
        int n5 = (int) d3; // 실수 > 정수는 반드시 정수형으로 캐스팅 해주어야함
        System.out.println(n5);


        //형변환시 주의점(변환될 타입과 문자열 내용이 틀리면 er)
        String num7 = "12.456";
        double n7 = Double.parseDouble(num7);
        System.out.println(n7);

        //final 키워드는 값을 한번만 설정 고정값

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a","b"));
        a.add("c");
        System.out.println(a);

    }
}
