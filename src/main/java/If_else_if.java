public class If_else_if {
    public static void main(String[] args) {
        if (true) {                 // 조건문에 값을 대입했을때 경우에 따라 true, false 로 나누어져야 조건문으로써의 효용이 있다
            System.out.println(1);
        } else if (false) {
            System.out.println(2);
        } else if (true) {          // else if 는 생략,중복 사용 가능
            System.out.println(3);
        } else {                     // 생략 가능
            System.out.println(4);
        }                            // 조건문 실행시 true 를 만족할때 값이 출력된다.
    }
}
