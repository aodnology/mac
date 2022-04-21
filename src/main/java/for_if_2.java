public class for_if_2 {
    public static void main(String[] args) {
        int hap = 0;
        for( int a = 50; a < 101; a++){
            if(( a % 3 != 0 ) && (a % 7 != 0) && (a % 11 !=0)){ // not 연산자를 쓸경우 논리연산자또한 반대로 써준다
                hap += a;
            }
        }
        System.out.println(hap);
    }
}
