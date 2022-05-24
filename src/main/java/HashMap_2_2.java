import java.util.*;

public class HashMap_2_2 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("이름", "박수호");
        list.add(map);
        map = null;

        map = new HashMap<>();

        map.put("name", "박수호");
        list.add(map);
        map = null;

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            Map rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
        }
        System.out.println("");

        for (Map<String, String> rMap : list) {
            System.out.println("이름 : " + rMap.get("이름"));
        }
        System.out.println("");

        list.forEach(rmap -> {
                    System.out.println("name : " + rmap.get("name"));
                }
        );
        System.out.println("");

        Iterator<Map<String, String>> it = list.iterator();

        while(it.hasNext()) {
            Map<String, String> rMap = it.next();
            System.out.println("이름 "+rMap.get("이름"));
        }
    }
}
