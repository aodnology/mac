import java.util.Scanner;

public class String_Method {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = s.nextLine();

        strRep = str.replace(" ", "$"); //문자열을 바꿔주는 replace()
        strSub = str.substring(3, 8);                    //문자열을 추출하는 substring()
        strAry = str.split(" ");                   //문자열을 분리하는 split()  <== 요구 분석시 많이 쓰임

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("입력 문자열 ==> " + strRep);
        System.out.println("입력 문자열 ==> " + strSub);
        for (int i = 0; i < strAry.length; i++){
            System.out.println("분리한 문자열"+ i +"==>"+ strAry[i]);
        }
    }
}
