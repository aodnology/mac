import java.util.*;

public class HashMap_2_2 {
    public static void main(String[] args) {
        List<Map<String, String>> L = new ArrayList<>(); // collction frameworks 는 제네릭을 통한 데이터유형을 선언해준다.
        Map<String, String> M = new HashMap<>();         // //제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미

        M.put("이름", "박수호"); // Hashmap에 데이터를 집어 넣는 코드 // 변수.put("key" "value");
        L.add(M);             // Arraylist에 Map(M)의 데이터를 집어 넣는 코드
        M = null;             // Map 의 데이터를 초기화 해주고

        M = new HashMap<>();  // 다시 해쉬맵 변수를 선언

        M.put("이름", "홍길동");
        L.add(M);
        M = null;

        int listSize = L.size();

        for (int i = 0; i < listSize; i++) {
            Map rMap = L.get(i);
            System.out.println("name : " + rMap.get("이름"));
        }
        System.out.println("");

        for (Map<String, String> rMap : L) {
            System.out.println("이름 : " + rMap.get("이름"));
        }
        System.out.println("");

        L.forEach(rmap -> {
                    System.out.println("name : " + rmap.get("이름"));
                }
        );
        System.out.println("");

        Iterator<Map<String, String>> it = L.iterator();

        while(it.hasNext()) {
            Map<String, String> rMap = it.next();
            System.out.println("이름 "+rMap.get("이름"));
        }
    }
}
