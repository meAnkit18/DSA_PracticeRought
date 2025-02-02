import java.util.ArrayList;
import java.util.List;

public class sfjbsjk {
    public static void main(String[] args) {
        System.out.println(Sque("","abc"));
    }
   static List<String> Sque(String f, String s){
        if(s.isEmpty()){
            List<String> l = new ArrayList<>();
            l.add(f);
            return l;
        }else {
            char ch = s.charAt(0);
            List<String> one = Sque(f+ch, s.substring(1));
            List<String> two = Sque(f, s.substring(1));
            one.addAll(two);
            return one;
        }

   }
}
