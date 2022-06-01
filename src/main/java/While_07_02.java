public class While_07_02 {
    public static void main(String[] args) {

        int hap = 0;
        int i = 0;
        while (i < 11) {
            hap += i;
            i++;
        }
        System.out.println("1 부터 10까지의 합 : " + hap);
    }
}
