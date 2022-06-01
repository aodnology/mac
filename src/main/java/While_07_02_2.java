import java.util.Scanner;

public class While_07_02_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num = 1; // 입력 받은 숫자와의 조건식을 위해 변수를 선언
        System.out.printf("1부터 몇번째 숫자까지 더하시겠습니까? : ");
        int i = s.nextInt();

        while(num < i+1){ // 입력된 값과의 비교를 통해 입력 값까지의 합을 구하기 위한 조건식
            hap += num;
            num++;
        }
        System.out.println(hap);
    }
}
