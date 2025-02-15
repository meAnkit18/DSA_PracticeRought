package rought;

import java.util.ArrayList;
import java.util.List;

public class DieAmazon {
    public static void main(String[] args) {
        System.out.println(diep("",4));

    }
    static List<String> diep(String p, int up){
        if(up==0){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();
        int arr[] = {1,2,3,4,5,6};
        for (int i = 0; i<up ; i++) {
            int ch  = arr[i];
            ans.addAll(diep(p+ch,up-ch));
        }
        return ans;
    }


}
