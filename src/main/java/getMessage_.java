public class getMessage_ {
    public static void main(String[] args) {

        int a = 100, b = 0;
        int result;
        try{
            result = a/b;  // 0으로 나누는 오류가 발생 / by zero
        } catch(ArithmeticException e) {
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
