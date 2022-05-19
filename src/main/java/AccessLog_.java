public class AccessLog_ {
    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("IP \n");
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        if (log.startsWith("111.222")) {

            int ipLastPos = log.indexOf(" ");
            System.out.println("ipLastPos : " + ipLastPos);
            System.out.println("IP : " + log.substring(0, ipLastPos));
            // System.out.println("111.222로 시작하는 IP가 호출한 로그입니다.");
        }
        System.out.println("--------------------------------");
        System.out.println("호출 시간 \n");

        // 호출시간 가져오기
        String[] item = log.split(" "); // 공백으로 나누기
        for (int i = 0; i < 5; i++) {
            System.out.println("item[" + i + "] : " + item[i]);
        }

        // item[3] : [11/Jun/2012:22:12:32t
        String time = item[3];

        System.out.println("time : " + time.substring(1, time.length()));
        System.out.println("--------------------------------");
    }
}
