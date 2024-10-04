import java.util.HashMap;
public class Ch03_맵 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Map","지도");
        map.put("List","리스트");
        System.out.println(map.get("Map"));
        System.out.println(map.containsKey("List"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.size());
    }
}
