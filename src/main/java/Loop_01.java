public class Loop_01 {
    public static void main(String[] args) {

        int a = 0;

        while (a < 10) {
            //a++; 인경우 반복 10까지 출력 됨.
            System.out.println("반복" + a);
            a++; // 증가연산자를 쓰지 않으면 a는 계속 0값이기 때문에
        }
    }       // int a = 0; , while (a<10) , a++;
            // 언제까지 반복할 것인지에 동원 된 요소
}
