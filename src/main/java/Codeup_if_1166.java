import java.util.Scanner;

public class Codeup_if_1166 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
