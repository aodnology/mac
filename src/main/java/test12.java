public class test12 {
    public static void main(String[] args) {

        int a [][] = new int[10][10];

        for (int i = 2; i<a.length; i++){
            if(i % 8 == 0){ // 만약 8단이 되면 반복문을 빠져나가세요 의 조건
                break;
            }
            if(i % 2 == 0){ // 2의 배수에는 몇단인지 출력하세요 의 조건
                System.out.println(i+"단");
            }
            for(int j = 1; j<a.length; j++){

                a[i][j]= i * j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
