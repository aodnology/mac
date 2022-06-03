/*
입력과 출력 또한 재활용과 같이 메소드의 면모이다.
메소드에 있어 입력과 출력은 메소드를 실행할때 언제가 똑같은 결과가 나오고 똑같은 동작을 한다고 하면
유사한 로직이지만 결과가 달라야 하는 경우에는 유사하다 해도 메소드를 다시 생성해야된다.
이말은 재활용 성이 떨어진다는 것과 같고 위와 같은 상황에서 입력과 출력의 개념을 진지하게 생각해볼 필요가 생긴다.

메소드가 입력하는 방식에 따라 동작이 달라져 그 결과를 출력한다면 똑같은 메소드를 굳이 만들 필요가 없어진다 ( 재활용 성이 높아짐 )
 */

public class Method_3 {
    public static void numbering(int limit) { // numbering(데이터형식 변수), 고정적 작성법 , 입력을 위한 도구 , 매개 변수 (Parameter)
     // int limit = 5;                        // 가변적 작성법
        int i = 0;
        while (i < limit){ // (i < limit) 파라미터의 값을 대입하는 것을 통해 numbering 메소드의 재활용 성을 높인 코드
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(5); // () 안에 입력된 설정 값에 따라 출력이 달라진다. ( 입력 값을 설정 하는 법 )
        /* 이 구문을 컴퓨터가 만나게 되면 numbering 메소드를 호출 하기 위해 11번 코드의 numbering(데이터형식 변수)으로 이동하고
           numbering(데이터형식 '변수'), 변수에다가 호출할때 기입된 값을 변수에 전달한다 (5가 기재되어있기 때문에 5가 대입된다)

           numbering(인자(argument)) , 입력을 위한 도구
         */
    }
}
