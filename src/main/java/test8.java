public class test8 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 4, 3, 6, 7, 8, 9, 6, 2, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // 큰수는 뒤에서 계속 고정되기 때문에 i 값을 빼준다
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(i+"번째 회전 결과는? : ");
            for (int k =0; k <arr.length; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
