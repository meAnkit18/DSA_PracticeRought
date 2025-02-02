import com.sun.jdi.IntegerType;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        int arr[]={2,432,5,6,4,2,4,42,3,2,2};
        int t =200;

        List<Integer> ans = c(arr,t,0);
        System.out.println(ans);

    }
   static List<Integer> c(int arr[],int t, int i){
        List<Integer> an = new java.util.ArrayList<>();
        if(i== arr.length){
            return an;

        }
        if (arr[i]==t){
            an.add(i);
        }

       List<Integer> ans = c(arr,t,i+1);
        an.addAll(ans);
        return an;
   }
}
