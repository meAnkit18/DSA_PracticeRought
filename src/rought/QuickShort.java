package rought;

import java.util.Arrays;

public class QuickShort {
    public static void main(String[] args) {
        int arr[] = {1,4,32,6,84,3,2,5,7};
        QShort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QShort(int arr[],int low, int hi){
        if(low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = (s+e)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s]< pivot){
                s++;
            }
            while (arr[e]> pivot){
                e--;
            }
            if(s<=e){
                int t = arr[s];
                arr[s]= arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        QShort(arr, low, e);
        QShort(arr, s, hi);
    }
}
