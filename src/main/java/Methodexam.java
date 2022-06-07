public class Methodexam {

    public static void main(String[] args) { // main 함수는 class가 생성 됐을때 가장 먼저 실행되는 메소드
        /*
        String a = "hello";
        String b = "Sooho Park";

        System.out.println(a + b);
         */
        Methodexam methodExam = new Methodexam();             //클래스 생성
        methodExam.StrExam("hello"," ", "Sooho Park");      // 메소드 실행 (String 타입을 2개 넘겨줌(Strexam))

        System.out.println(methodExam.StrSooho("hi"," ","java Programming"));
    }
    // 메소드를 만든 것
    // 메소드를 만든 이유
    // 1. 유지보수
    // 2. 가독성 좋아짐
    // 3. 캡슐화 (여러 곳에서 중복된 코드를 작설할 필요없이 메소드를 불러와서 사용 가능해짐)
    public void StrExam(String a, String b, String c) { // Strexam 메소드를 호출할 때의 타입과 변수명을 선언 (a에는 hello , b에는 Sooho Park 이 담긴 상태)
    //public : 접근 제한자 , void : 실행형 메소드

        String result = a + b + c;
        System.out.println(result);
    }
    public String StrSooho (String a, String b, String c){  // return형 메소드
        String result = a + b + c;
        return result;
    }
}