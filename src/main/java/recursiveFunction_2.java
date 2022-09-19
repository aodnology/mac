public class recursiveFunction_2 {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("1부터 " + N + "까지의 합계 : " +
                PlusPlus(5));
    }

    public static int PlusPlus(int n) {
        if (n == 0)
            return 0;

        return n += PlusPlus(n - 1);
    }
}
        /*
        int hap = 0;

        for(int i = 1; i<6; i++){
            hap += i;
        }
        System.out.println(hap);
    }
         */