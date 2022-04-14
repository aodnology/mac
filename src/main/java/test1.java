public class test1 {
    public static void main(String[] args) {

        loop1 : for (int i = 2; i<10; i++){
            for (int j=1; j<10; j++){
                if(j == 1){
                    break loop1;
                    //break;
                    //continue loop1;
                    //continue;
                }
                System.out.println("그냥 break, continue");
            }
        }
        System.out.println("이름 붙인 break, continue!");
    }
}
