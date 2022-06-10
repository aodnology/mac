public class AccessLog_2 {
    public static void main(String[] args) {
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        //IP
        int ip = log.indexOf(" ");
        System.out.println("IP : " + log.substring(0, ip));

        String ip2 = log.substring(log.indexOf("1"), log.indexOf(" "));
        System.out.println("ip : " + ip2);

        //시간
        String[] item = log.split(" ");
        String time = item[3];
        System.out.println("시간 : " + time.substring(1, time.length()));

        String time2 = log.substring(log.indexOf("[") +1, log.indexOf(" +"));
        System.out.println("time : " +time2);


    }
}
