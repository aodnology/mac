public class Loop05 {
    public static void main(String[] args) {
        // 반복문의 중첩
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
                /*
                첫번째 for 문은 i 값 중첩된 두번째 for 문은 j 값을 출력한다
                첫번째 for 문의 i가 0값을 가진 체 중첩 for 문의 조건이 false가 될때까지 중첩 for문은 반복, 출력 되는데
                결과적으로 j < 10 조건이 false가 될때까지 반복때문에 9까지 증가하고 10이 됐을때 false가 되어
                다시 첫번째 for문의 조건을 반복하여 수행하고 중첩 for문도 같은 조건을 반복한다
                ( 00 01 02 03 04 ~ 95 96 97 98 99 )
                 */
            }
        }
    }
}
