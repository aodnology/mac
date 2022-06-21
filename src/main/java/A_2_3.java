public class A_2_3 {
    public static void main(String[] args) {

        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900]";
        int ip = log.indexOf(" ");
        System.out.println(log.substring(0, ip));

        String time = log.substring(log.indexOf("[")+1, log.indexOf(" +"));
        System.out.println(time);
    }
}
