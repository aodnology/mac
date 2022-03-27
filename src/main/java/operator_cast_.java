public class operator_cast_ {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a / b); // 정수
        System.out.println(c / d); // 실수
        System.out.println(a / d); // 정수와 실수 연산시 실수 결과 도출
    }
}
