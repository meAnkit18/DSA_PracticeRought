package Shroting;

import java.util.Arrays;

public class quickshot {
    public static void main(String[] args) {
        int arr[] = {4,6,36,2,8,4,77};
        quickshot(arr,0, arr.length-1);
        System.out.println("main print "+ Arrays.toString(arr));
    }
    static void quickshot (int arr[], int s, int e){
        if(s<e){
            int p = pivoit(arr,s,e);
            quickshot(arr,0,p-1);
            quickshot(arr,p+1,e);
        }

    }

    static int pivoit(int arr[], int s, int e){
        int j = 0;
        int i = j-1;
        int p = arr[e];
        while (j<=e){
            if (arr[j]<=p){
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }else {
                j++;
            }
        }
        return i;
    }
}
