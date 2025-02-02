import java.util.Arrays;

public class MeargeShot {
    public static void main(String[] args) {
        int arr[] = {1,4,32,6,84,3,2,5,7};
        int ans[] = margeshoting(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] margeshoting(int arr[]){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;
        int[] l = margeshoting(Arrays.copyOfRange(arr,0, mid));
        int[] r = margeshoting(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(l,r);
    }

    private static int[] merge(int[] l, int[] r) {
        int mix[] = new int[l.length+r.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<l.length && j< r.length){
            if(l[i]<r[j]){
                mix[k]= l[i];
                i++;

            }else {
                mix[k]= r[j];
                j++;

            }
            k++;
        }

        while(i<l.length){
            mix[k]=l[i];
            i++;
            k++;
        }
        while(j<r.length){
            mix[k]= r[j];
            j++;
            k++;
        }

        return mix;

    }

}
