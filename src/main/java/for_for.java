public class for_for {
    public static void main(String[] args){

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.println(i+""+j);
            }
        }
    }
}
/* for문이 중첩될때 for 문 안에 for문이 종료조건이 될때까지 반복한다
   (i=0 값은 j<10 이라는 종료조건까지 계속 반복 -> 00,01,~09)
   j가 10이 j의 사이클이 종료되었을때 i도 종료되고 증감식의 조건에 맞게 다시 대입 된다
   (i=1 , 10,11,~19)
   다시 말해 첫번째 for문의 조건식이 실행되고
   중첩된 for문이 종료조건에 만족될때까지 첫번째 for문의 값은 편하지 않고 함께 반복되며
   중첩 for문의 종료조건이 종료되었을때 함께 종료 되며 첫번째 for문의 종료 조건이 만족 될때까지 이 사이클은 유지된다
 */