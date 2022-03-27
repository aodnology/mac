public class If_2 {
    public static void main(String[] args) {
        if (false) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4); // then 절 모두 true이기 때문에
        }
        System.out.println(5);     // 메인함수의 5만 출력된다.
    }
}
