public class length_2 {
    public static void main(String[] args) {

        String str = "It CookBook, java";
        int len;

        len = str.length(); //문자열의 길이를 알려줌

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 %d \n", len);

        if(str.length() > 0){
            System.out.println("str 변수에 값 존재");
        } else {
            System.out.println("str 변수에 값이 존재하지 않음");
        }
        // 데이터가 값을 가지고 있는지 없는지를 확인 할 때 쓰임.
    }
}
