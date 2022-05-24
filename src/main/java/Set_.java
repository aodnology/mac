import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set_ {
    public static void main(String[] args) {
        // set 은 수학에서 집합과 같다

        String[] arrayObj = new String[2];
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        // 중복되는 값을 허용하지 않는다 = 중복되는 값을 통합하여 처리한다.

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); // false
        // A라는 집합에 B라는 집합이 담겨있냐는 뜻의 코드
        System.out.println(A.containsAll(C)); // true

        //A.addAll(B);
        //A.retainAll(B);
        //A.removeAll(B);

        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }

    }
}
