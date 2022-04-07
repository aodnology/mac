public class Loop04_02 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5)                   // i 의 값이 5가 됐을때
                continue;                 // continue 를 만나 다시 조건이 시작되어
            System.out.println("coding" + i); // coding5 는 출력되지 않는다
        }
    }
}
