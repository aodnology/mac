public class test11 {
    public static void main(String[] args) {
        /*
        이해하기 쉬운건 2중 반복문 또는 또는 엑셀과 같음

        int[][] a;
        int b[][];
        int[] c[]; // 세가지 선언 방법이 있다
        */
        int[][] arr = new int[10][10];

        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {

                arr[i][j] = i * j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
