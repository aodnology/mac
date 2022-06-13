public class Try_catch {
    public static void main(String[] args) {

        int [] aa = new int[3]; // 크기 3의 배열을 선언

        try {
            aa[3]=100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
        }
    }
}
