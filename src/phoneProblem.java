
import java.util.ArrayList;
import java.util.List;
public class phoneProblem {
    public static void main(String[] args) {
        Phone("","67");
    }
    static void Phone(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }


        int d = up.charAt(0)-'0';
        for (int i = ((d-1)*3); i <(d*3) ; i++) {
            char ch = (char)('a'+i);

            Phone(p+ch,up.substring(1));
        }

    }
}
