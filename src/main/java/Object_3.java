class print {
    /* 클래스에 소속될 맴버들을 이사 시킨 상태 */
    /* object2의 코드와 결과 값은 같지만 만약 이와 같은 코드가 1억개가 넘게 있다고 가정했을때
    delimiter, printA(), printB()가 서로 연관 되어 있지만 육안으로 확인하기가 쉽지 않다
    서로 연관된 메소드를 같은 클래스에 소속시켜 클래서 안에 메소드들이 서로 연관 되어있음을 확인하기 쉽고 다른 함수에 적용하기가 용이해진다 */
    public static String delimiter;
    public static void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("Aa");
    }

    public static void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("Bb");
    }
}

public class Object_3 {
    public static void main(String[] args) {
        print.delimiter = "----";
        print.A(); //print라는 클래스에 소속된 A 메소드 라는 의미
        print.A();
        print.B();
        print.B();

        print.delimiter = "====";
        print.A();
        print.A();
        print.B();
        print.B();

    }
    /* object2

        public static void main(String[] args) {
        delimiter = "----";
        printA();
        printA();
        printB();
        printB();

        delimiter = "====";
        printA();
        printA();
        printB();
        printB();
    }
    public static String delimiter;
    public static void printA() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("Aa");
    }
    public static void printB() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("Bb");
    }
    */
}
