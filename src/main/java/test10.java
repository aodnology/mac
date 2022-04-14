public class test10 {
    public static void main(String[] args) {
        String a, b, c;
        int[] arr = new int[15];
        a = "12345";
        b = "54321";
        c = "45678";

        String result = a + b + c;
        System.out.println(result);

        for (int i = 0; i < arr.length; i++) {
            arr[result.charAt(i) - '0']++; // charAt은 한글자만 가져올수 있다 '-' 유니코드로 연산을 하게하는 코드
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
