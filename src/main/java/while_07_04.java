import java.io.IOException;
import java.util.Scanner;

public class while_07_04 {
    public static void main(String[] args) throws IOException { // system.in.read()를 사용하기 위한 필수 사항
        Scanner s = new Scanner(System.in);
        System.out.printf("몇 단을 구하겠습니까? : ");
        int a = s.nextInt();
        int b = 1;
        while (b < 10) {
            System.out.println(a + " X " + b + " = " + (a * b));
            b++;
        }
    }
}
