public class cast_2 {
    public static void main(String[] args) {
        /*
        float a = 100.0;
        100.0은 double 타입이기 때문에 더 작은 단위인 float형에 대입되지 않는다

        int b = 100.0F;
        100.0F를 사용하여 float 데이터 타입으로 선언을 해줘도 int형은 float형 보다
        표현 범위가 좁기 때문에 마찬가지로 대입 되지 않는다
        */

        float a = (float)100.0; // 100.0 실수
        int b = (int)100.0F;    // 100 정수

        /*
        곧 죽어도 double 형인 100.0 을 float , int에 적용하는 방법
        */

        System.out.println(a+" "+b);
    }
}
