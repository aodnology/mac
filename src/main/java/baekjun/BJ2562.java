package baekjun;

import java.util.Scanner;

public class BJ2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1); // 0부터 시작
    }
}