import java.util.Arrays;
import java.util.Collections;

public class Arrays_sort_ {
    public static void main(String[] args) {
        int[] aa = {26, 20, 44, 54, 30, 40, 93, 37};
        Integer[] aa2 = {26, 20, 44, 54, 30, 40, 93, 37};

        Arrays.sort(aa);                             // 오름차순

        for (int a : aa) {                           // 개선된 for문
            System.out.printf("오름차순" + a + ", ");
        }
        System.out.println();

        Arrays.sort(aa2, Collections.reverseOrder());// 내림차순
        for (int a2 : aa2) {
            System.out.printf("내림차순" + a2 + ", ");
        }
    }
}
