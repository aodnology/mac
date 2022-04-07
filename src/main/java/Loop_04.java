public class Loop_04 {
    public static void main(String[] args) {
        // 반복문 실행중에
        for (int i = 0; i < 10; i++) { // 0~9 까지 출력
            if (i == 5)                // 반복문이 실행되는 중간에 if 조건 값이 true가 될경우
                break;                 // 반복문이 종료된다.
            System.out.println("coding" + i);
        }
    }
}
