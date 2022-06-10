public class String_Method_2 {
    public static void main(String[] args) {
        String str = " 한글 ABCD efgh ";

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]"); // 대문자 변환
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]"); // 소문자 변환
        System.out.println("공백제거 ==> [" + str.trim() + "]");        // 공백 제거
    }
}