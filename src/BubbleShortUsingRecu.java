import java.util.Arrays;
import java.util.List;

public class BubbleShortUsingRecu {
    public static void main(String[] args) {
     int arr[] = {1,4,32,6,84,3,2,5,7};
     Bubble(arr,0, arr.length-1);


    }

    static void Bubble(int arr[],int s,int e){
        if(e==0){
            System.out.println(Arrays.toString(arr));

            return;
        }else if(s==e){
            Bubble(arr,0,e-1);
        }
        else if(arr[s]>arr[s+1]){
            int t=arr[s];
            arr[s]=arr[s+1];
            arr[s+1]=t;
            Bubble(arr,s+1,e);
        }else {
            Bubble(arr,s+1,e);
        }

    }

}
