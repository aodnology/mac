import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ {
    public static void main(String[] args) {

        // ArrayList 구현 방식으로 메모리에 올리기
        List<String> list = new ArrayList<>();

        // List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("김영운");
        list.add("배수환");
        list.add("김주경");
        list.add("길용단");

        //list의 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        // for each문으로 조회
        for (String name : list) {
            System.out.println("이름 : " + name);
        }
        // 람다 식으로 조회
        list.forEach(name -> System.out.println("name : " + name));

        //Iterator를 활용한 방법 -> 개발 유지보수에 좋음 근데 구식
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}