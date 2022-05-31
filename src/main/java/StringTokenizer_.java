import java.util.StringTokenizer;

public class StringTokenizer_ {
    public static void main(String[] args) {

        String str = "Hello World";
        StringTokenizer st = new StringTokenizer(str, " ");

        while (st.hasMoreTokens()) { //다음에 읽어올 토큰이 있으면 true 없으면 false
            System.out.println(st.nextToken());
        }
    }
}
