import java.util.Scanner;

public class while_07_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("짝수를 제외한 합을 구할 정수를 입력하세요 : ");
        int a = s.nextInt();
        int b = 1;
        int hap = 0;
        while (b < a + 1) {
            if (b % 2 != 0) {
                hap += b;
            }
            b++;
        }
        System.out.println(hap);
    }
}
