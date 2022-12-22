import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator_exam {
    public static void main(String[] args) {
        /*
        Iterator : collection framework에서 값을 가져오거나 삭제할 때 사용

        선언방법
        Iterator<datatype> iterator변수명 = 컬렉션.iterator();

        * */

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        Iterator<String> iterList = list.iterator();
        Iterator<String> iterSet = set.iterator();
        Iterator<String> iterMap = map.keySet().iterator();

        // Iterator에 있는 값 꺼내기
        // while(iterList.hasNext()) {
        // 	 System.out.println(iterList.next());
        // }

        System.out.println(iterList.next()); // iterator 다음 값 가져오기
        iterList.remove(); // next()에 나온 값을 list에서 삭제함
        System.out.println("Remove 테스트용");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // A 삭제된 것 확인 가능
        }
    }
}
