public class test3 {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] copy = new int[arr.length*2];
        System.out.println(copy.length);

        for(int i = 0; i<arr.length; i++){
            copy[i] = arr[i];

            System.out.println(copy[i]);

        }
        arr = copy;
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
            // copy 배열에 arr 주소에 있는 값을 대입한다
            //
        }
    }
}
