import java.util.Scanner;

public class for_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int b =1; b<10; b++){
            System.out.println(a+"X"+b+"="+(a*b));
        }
    }
}
