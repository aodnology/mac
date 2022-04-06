public class Loop_03 {
    public static void main(String[] args) {
        /*

        System.out.println("coding1");
        문을 1000번 작성

         */
        /*

        for (int a = 0; a < 1000; a++) {
            System.out.println("coding"+a);
        }

       */
        /*

        int a = 0;
        while( a < 1000 );
            System.out.println("coding"+a);
            i++;

         */
        // 결과가 같음.
        // 반복문 뒤에 2의 배수를 쓰는 조건
        int a = 0;
        while(a < 10){
            System.out.println("cording"+(a+1)*2);
            a++;
        }
    }
}