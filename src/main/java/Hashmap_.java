import java.util.HashMap;
import java.util.Map;
public class Hashmap_ {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "박수호");
        map.put("email", "aodnology@gmail.com");
        map.put("dept", "데이터 분석과");

        System.out.println("----------------------------");
        System.out.println("name : " +map.get("name"));
        System.out.println("email : " +map.get("email"));
        System.out.println("dept : " +map.get("dept"));
        System.out.println("----------------------------");
    }
}
