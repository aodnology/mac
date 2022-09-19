import java.util.Arrays;

public class recursiveFunction_4 {
    public static void main(String[] args) {
        int arr[] = {0, 30, 20, 40, 80, 60, 90};
        System.out.println(ArraySort(arr, 7));

        Arrays.sort(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        int maxNum = arr[arr.length - 1];
        System.out.println("최대값" + maxNum);
    }

    public static int ArraySort(int[] a, int n) {

        int x;
        if (n == 1)
            return a[0];
        else
            x = ArraySort(a, n - 1);
        if (x > a[n - 1])
            return x;
        else
            return a[n - 1];
    }
}
