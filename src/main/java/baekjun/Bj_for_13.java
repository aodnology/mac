package baekjun;

import java.util.Scanner;

public class Bj_for_13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {

            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a + b);
        }
    }
}