/*
Method_3에서는 시작되는 값이 지정된 상태라 특정한 값부터 limit까지 출력하라고 요건이 바꾼경우(시작값과 출력값이 가변적으로 변하는 경우)범용성이 떨어졌다.
이 예제는 시작값 출력값 모두 가변적인 영역으로 변경하여 재활용성, 입력의 범용성을 높인다.
 */

public class Method_3_2 {
    public static void numbering(int init, int limit){
        int i = init;
        while (i < limit){
            System.out.printf("%d ",i);
            i++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        numbering(2,10);
        numbering(5,10);
        numbering(7,99);
    }
}
