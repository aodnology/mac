public class Object_2 {

    //생활코딩 변수와 메소드

    public static String delimiter; // 전역변수 ( class에 직접 변수를 선언하는 것으로 여러 메소드에 변수를 가져다 쓸 수 있다 )

    public static void printA(){
        System.out.println(delimiter);
        System.out.println("A");
    }
    public static void printB(){
        System.out.println(delimiter);
        System.out.println("B");
    }
    public static void main(String[] args) {

        delimiter = "----";
        printA();
        printB();

        delimiter = "****";
        printA();
        printB();
    }
}
