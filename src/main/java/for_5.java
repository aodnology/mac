public class for_5 {
    public static void main(String[] args) {
        for (int a = 0; a < 5; a++) {
            for (int b = 4; b > a; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

