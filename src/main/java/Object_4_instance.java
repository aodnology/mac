class print2{
    public String delimiter = "";
// 2. String은 현제 print 클래스에 소속된 상태
    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

public class Object_4_instance {
    public static void main(String[] args) {
        print2 p1 = new print2();
   //1. 클래스명 변수 = 복제 메소드형식   == instance 생성 원칙
   //   instance == class 를 복제

   //   instance를 사용하기 위해선 복제할 클래스의 static을 지워준다.
   //ex)public static String delimiter
   // ->public String delimiter

        p1.delimiter = "----"; // 3. Print2 소속인 String delimiter를 인스턴스 소속으로 사용
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        print2 p2 = new print2();
        p2.delimiter = "****";
        p2.A();
        p2.A();
        p2.B();
        p2.B();

        p1.A();
        p2.A();
        p1.B();
        p2.B();

        // 인스턴스를 사용하여 클래스를 복제하는 것으로 delimiter (구분자) 코드를 생략하여 사용 할 수 있다
    }
}
