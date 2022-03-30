public class while_2 {
    public static void main(String[] args) {

        int i = 2;
        int j = 1;

        while(i<10){
            while(j<10){
                System.out.println(i+" x "+j+" = "+i*j+"입니다");
                j++;
            }
            System.out.println("");
            j=1; // j를 1로 초기화 한 이유 = 두번째 while 문에서 j의 조건이 충족
            i++; //
        }
    }
}
