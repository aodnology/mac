public class for_2_2 {
    public static void main(String[] args) {
        for (int a = 1; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                if (a > b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
