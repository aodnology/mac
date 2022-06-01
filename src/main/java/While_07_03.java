import java.util.Scanner;

public class While_07_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) { // 조건식이 무조건 참이므로 무한 루프가 돌아간다 = for( ; ; )
            System.out.printf("첫번째 값 : ");
            int a = s.nextInt();
            System.out.printf("두번째 값 : ");
            int b = s.nextInt();

            System.out.println(a+b);
        }
    }
}
