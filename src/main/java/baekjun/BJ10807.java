package baekjun;

import java.util.Scanner;

public class BJ10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("총 입력 개수는? : ");

        // 입력 받을 정수의 총 갯수
        int n = s.nextInt();
        // 입력 받은 정수의 갯수를 배열의 크기로 지정
        int arr[] = new int[n];
        // 같은 정수가 몇번 입력 됬는지 확인할 변수
        int count = 0;

        for (int i = 0; i < n + 1; i++){
            arr[i] = s.nextInt();
        }
        // 정수 입력
        int v = s.nextInt();

        for(int i = 0; i <arr.length; i++) {
            if (v == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
