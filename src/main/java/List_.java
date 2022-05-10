import java.util.ArrayList;
import java.util.List;
public class List_ {
    public static void main(String[] args){
        List<String>list = new ArrayList<>();

        list.add("이협건");
        list.add("김영운");

        int listSize= list.size();

        for(int i =0; i<listSize; i++){
            System.out.println("이름 : "+list.get(i));
        }
    }
}
