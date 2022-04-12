public class for_6 {
    public static void main(String[] args) {
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = 5; c > a; c--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
