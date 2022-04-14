import java.util.Arrays;
import java.util.Collections;

public class test6 {
    public static void main(String[] args) {
// collections 가져오려면 intager 사용해야됨
        int[] score = {26, 20, 44, 54, 30, 40, 98, 37};
        Integer[] score2 = {26, 20, 44, 54, 30, 40, 98, 37};

        Arrays.sort(score); // 오름차순 정렬

        for(int i = 0; i<score.length; i++){
            System.out.println("정렬된"+i+"번지 값은? : "+score[i]);
        }
        System.out.println();

        Arrays.sort(score2, Collections.reverseOrder()); //내림차순
        for(int i = 0; i<score2.length; i++){
            System.out.println("정렬된 "+i+"번지 값은? :"+score2[i]);
        }
    }
}
