import java.io.FileWriter;
import java.io.IOException;

public class Object_ {
    //생활코딩 남의 클래스 & 남의 인스턴스
    public static void main(String[] args) throws IOException {
                                        // FilewWriter 예외처리 ( 현재 파일이 (data.txt) 없어서 생기는 에러를 예외 처리 함 )

        // class : System, Math, FileWriter
        // instance : f1, f2

        System.out.println(Math.PI); // Math.PI == Math라는 클래스 안에 PI 라는 변수가 있다.
        System.out.println(Math.floor(1.8)); // Math.floor() == Math라는 클래스 안에 floor(소수점 내림)라는 매소드가 있음
        System.out.println(Math.ceil(1.8)); // ceil(소수점 올림)

        // 서로 연관 된, 같은 주제가 변수와 메소드를 그루핑한 껍대기를 클래스라고 한다.

        //FileWriter == 파일에 기록할때 쓰는 클래스
     //   클래스    변수
        FileWriter f1 = new FileWriter("data.txt"); // new 를 사용하여 변수 f1에 값을 담는 복제본을 생성
        f1.write("박수호");
        f1.write("공부중");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("열심히");
        f2.write("살자");
        f2.close();


    }
}
