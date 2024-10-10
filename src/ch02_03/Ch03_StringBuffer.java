package ch02_03;

public class Ch03_StringBuffer {
    public static void main(String[] args) {
        //스트링버퍼는 문자열을 추가하거나 변경 할 때 사용하는 자료형
        StringBuffer sb = new StringBuffer(); //StringBuffer 타입의 객체 sb 를 생성
        //버퍼 객체는 append 메소드를 사용해서 문자열을 추가한다
        sb.append("Hello World");
        sb.append(" ");
        sb.append("점프 to 자바");

        System.out.println(sb);

        //sb 대신 문자열로

        String result = "";
        result += "민정아"; //result = result + "헬로우"
        result += " ";
        result += "사랑해";
        result += "♥";
        System.out.println(result);

        // insert 특정 위치에 문자열을 삽입
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Jump to Java");
        sb2.insert(0,"hello "); // 0번째 인덱스에 추가됨
        System.out.println(sb2.toString());
        // subString 문자열 잘라내기
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello jump to Java");
        System.out.println(sb.substring(0,5));
    }
}
