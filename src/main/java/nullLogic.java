public class nullLogic {
    /* 문자열을 입력 받아 null 값이면 빈 공백으로 바꿔주는 로직 */
    public static String nvl(String str, String chg_str) {
        String res;

        if (str == null) {
            res = chg_str;
        } else if (str.equals("")) {
            res = chg_str;
        } else {
            res = str;
        }
        return res;
    }

    public static String nvl(String str) {
        return nvl(str, "");
    }
}
