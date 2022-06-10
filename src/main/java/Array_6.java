import java.util.Scanner;

public class Array_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa[] = new int[3];
        int hap = 0;
        int i;
        // 3개의 공간을 가진 배열을 생성
        // 배열의 총합을 담을 변수 선언
        // 반복문과 배열의 번호를 지정해 주기 위한 변수 선언

        for (i =0; i < 3; i++){
            System.out.printf((i+1)+"번째 배열에 입력될 숫자 : ");
            aa[i] = s.nextInt();
        }
        // for문 작성
        // 번호가 0번부터 시작하기 때문에 i에 1을 더해줌
        // 배열에 숫자를 입력

        for (i= 0; i < 3; i++) {
            System.out.println("aa["+i+"] = "+ aa[i]);
            hap += aa[i];
        }
        // for문 작성
        // 각 배열에 어떤 숫자가 입력되었는지 출력함
        // 각 배열에 입력된 값을 더해줌

        System.out.println("배열의 총합 : "+hap);
        System.out.println("배열의 길이 : "+aa.length);
        // hap변수에 담긴 배열의 총합을 출력
        // aa.length == aa 배열의 길이를 length를 통해 출력

        int count = aa.length;
        System.out.println("배열의 길이(2) : "+count);
        // 배열의 길이를 담을 변수를 정수형 변수 count에 담은 후
        // println문에 count를 입력하여 출력
    }
}
