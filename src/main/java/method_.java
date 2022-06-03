/*
반복문,조건문,변수,상수와 같은 것들은 프로그래밍에 있어 가장 '기본'적인 것이다.
메소드나 객체지향과 같은 개념은 웅장하고, 결함이 없고, 유지보수가 쉬운 애플리케이션을 만들기 위한 기법들이라고 할 수 있다. ( 관리 도구 같은 것 )

Ex)

public static void main(String[] args){ // main == method
    return;(실행 되기를 기대하는 코드)
}

*/
// methoud의 정의와 호출
public class method_ {
    public static void numbering() { // 메소드의 정의 , 메소드이름() {} <- 가 나오면 정의라고 컴퓨터가 인식함
        //numbering 이라는 메소드를 정의
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
}

    public static void main(String[] args) {
        numbering(); //numbering 메소드를 호출 , numbering이라는 메소드의 본문을 호출
        // 메소드이름() 기재후 아무것도 나오지 않으면 컴퓨터는 호출로 인식함
        /*
        int i = 0;
        while (i < 10) {
        System.out.println(i);
        i++; 과 같은 의미를 갖는다.
        ( 결과 값이 같다 )
         */
    }
}