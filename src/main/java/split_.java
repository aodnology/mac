public class split_ {
    public static void main(String[] args) {
        // 특수 문자 주의

        String str = "안녕하세요 여러분";

        String[] result = str.split(" ");

        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
