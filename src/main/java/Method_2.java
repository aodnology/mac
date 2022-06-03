/*
 */
public class Method_2 {
    public static void num() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d",i);     // 이미 정의해 놓은 로직 ( for ~ } )을
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        num();
        num();
        num();
        // 재활용 하는데에 있어 method는 의미를 갖게 된다. ( 유지보수, 코드량줄임 )
        // 자주 사용하는 로직을 메소드로 만들어두면 호출하는 것을 통해서 간편하게 로직을 재활용 할 수 있다.
    }
}
