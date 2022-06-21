import java.util.*;

public class A_2_2 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("name", "박수호");
        map.put("addr", "마포구");
        map.put("email", "aodnology@gamil.com");

        list.add(map);
        map = null;

        map = new HashMap<>(); //

        map.put("name", "길동");
        map.put("addr", "서울");
        map.put("email", "gd@gamil.com");

        list.add(map);
        map = null;

        // 여러가지 반복문의 예

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            Map rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("email : " + rMap.get("email"));
        }

        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            Map<String, String> rMap = it.next();
            System.out.println("name : " + rMap.get("name"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("email : " + rMap.get("email"));
        }

        for (Map<String, String> rMap : list) {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("email : " + rMap.get("email"));
        }

        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("email : " + rMap.get("email"));
        });


    }
}
