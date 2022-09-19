public class recursiveFunction {
    public static void main(String[] args) {
        /*
        재귀함수 : 함수 안에 자신의 함수를 다시 호출하는 함수
                 함수가 직,간접적으로 자신을 호출하는 프로세스
                 자신의 로직을 내부적으로 반복

        재귀 : 원래의 자리로 되돌아가거나 되돌아온다는 뜻
        */

        //HelloWorld 반복 출력
        HelloWorld(5); // HelloWorld 출력 메서드 호출
    }
        public static void HelloWorld(int n) {
            if (n == 0)
                return;

            System.out.println("HelloWorld");
            HelloWorld(n - 1); //제귀함수 시작 부분
            // n이 0이 될 때까지 메소드 실행
        }
}
