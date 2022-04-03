import java.util.Scanner;

public class if_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h=sc.nextInt();
        int m=sc.nextInt();
        int timer =sc.nextInt();

        m+=timer;
        if(m>=60) {
            while(m>=60) {
                m-=60;
                h++;
                if(h>=24) {
                    h=0;
                }
            }
        }
        System.out.println(h+" "+m);
    }
}
