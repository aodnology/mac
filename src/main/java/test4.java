import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int a = s.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = s.nextInt();

            sum += arr[i];
        }
        average = sum / a;
        System.out.println("총점은? : "+sum);
        System.out.println("평균점수는? : "+ average);
    }
}