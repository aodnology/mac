import java.util.HashMap;
import java.util.Map;

public class HashMap_3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "박수호");
        map.put("name", "이협건");
        map.put("이름", "박수호");
        System.out.println(map.get("name"));
        System.out.println(map.get("이름"));
        // key 값과 value 값 중복의 차이점

        map = null;

        HashMap<String, Integer> a = new HashMap<>();
        //a 라는 변수에 HashMap의 instance를 담음
        //인스턴스(Instance) : 클래스의 현재 생성된 오브젝트,
        //해당 클래스의 구조로 컴퓨터 저장공간에서 할당된 실체를 의미

        a.put("one", 1); // put method는 map에서만 존재
        a.put("two", 2); // a(a)라는 변수에 key = two, value = 2 인 값을 넣겠다는 의미
        a.put("three", 3);
        a.put("four", 4);
        a.put("five", 5);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
    }
}
