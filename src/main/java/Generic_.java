class generic<T>{
    public T info;
}
public class Generic_ {
    public static void main(String[] args) {
        //제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미
        //매개변수는 어떠한 변수에 들어갈 값과 관련
        //제네릭은 변수에 들어갈 값의 데이터 타입과 관련

        generic<String> g1 = new generic<String>();
        generic<StringBuilder> g2 = new generic<StringBuilder>();
    }
}
