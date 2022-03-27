public class Equal_2 {
    public static void main(String[] args) {

        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        // 문자열을 비교할때 .equals를 사용한다
        // (a    .equals    (b))
    }
}
