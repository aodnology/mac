import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("김영운");
        list.add("이협건");

        int listSize = list.size();

        // 반복문의 예
        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        // for each
        for (String a : list) {
            System.out.println("이름 : " + a);
        }

        //람다식
        list.forEach(name -> System.out.println("name : " + name));

        //Iterator를 사용한 방식
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
