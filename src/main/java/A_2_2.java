import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A_2_2 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("name", "박수호");
        map.put("addr", "마포구");
        map.put("email", "aodnology@gamil.com");

        list.add(map);
        map = null;

        map = new HashMap<>();

        map.put("name", "길동");
        map.put("addr", "서울");
        map.put("email", "gd@gamil.com");

        list.add(map);
        map = null;

        for(Map<String, String> rmap : list) {
            System.out.println("name : "+rmap.get("name"));
            System.out.println("name : "+rmap.get("addr"));
            System.out.println("name : "+rmap.get("email"));
        }

    }
}
