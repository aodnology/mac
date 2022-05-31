import java.util.Scanner;

public class startsWith_endsWith_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 : ");
        str = s.nextLine();

        System.out.print("출력 문자열 : ");

        if(!str.startsWith("("))                    // 문자열의 시작이 ( 가 아니면
            System.out.printf("(");                 // ( 를 출력한다.

        for (int i = 0; i < str.length(); i++){
            System.out.printf("%c", str.charAt(i)); // 입력한 문자를 모두 출력한다는 의미
        }
        if(!str.endsWith(")"))                      // 문자열의 마지막이 )가 아니면
            System.out.printf(")");                 // ) 를 출력한다.
    }
}