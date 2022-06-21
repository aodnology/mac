import java.util.Scanner;

public class A_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa[] = new int[4];
        int hap = 0;

        for(int i = 0; i<aa.length; i++){
            System.out.println((i+1)+"번째 배열의 값 : ");
            aa[i] = s.nextInt();
        }
        for(int i = 0; i<aa.length; i++){
            System.out.println((i+1)+"번째 배열의 값 : "+aa[i]);
            hap += aa[i];
        }
        System.out.println("배열의 총합 : "+hap);
        System.out.println("배열의 길이 : "+aa.length);
    }
}
