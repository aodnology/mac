import java.util.Arrays;
import java.util.Scanner;

public class arrangement_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int aa[] = new int[num];

        // 배열의 길이만큼 돌면서 i에 입력값을 받는다
        for (int i=0; i<aa.length; i++) {
            aa[i] = sc.nextInt();
        }

        // sort를 사용해 배열을 정렬한다
        Arrays.sort(aa);
        // 정렬된 배열의 가장 작은 수
        // 0번 인덱스의 것 = min 값
        // 배열길이 -1 인덱스의 것 = max 값
        System.out.println(aa[0] + " " + aa[num - 1]);
    }
}
