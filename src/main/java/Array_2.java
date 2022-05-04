public class Array_2 {
    public static void main(String[] args) {
        String[] classgroup = new String[4];
        //String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"}; 과 같은 의미
        classgroup[0] = "최진혁";
        System.out.println(classgroup.length); //length는 classgroup 변수에 담겨있는 배열은 몇개의 값을 수용 할수 있느냐를 알려 줌 (4)
        classgroup[1] = "최유빈";
        System.out.println(classgroup.length);
        classgroup[2] = "한아람";
        System.out.println(classgroup.length);
        classgroup[3] = "박수호";
        System.out.println(classgroup.length);
    }
}
