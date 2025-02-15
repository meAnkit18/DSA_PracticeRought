package rought;

import java.util.Arrays;

public class SelctionShortURecu {
    public static void main(String[] args) {
        int arr[] = {1,4,32,6,84,3,2,5,7};
        Selection(arr,arr.length);

    }
    static void Selection(int arr[],int e){
        if(e==0){
            System.out.println("Shoted Array is : "+Arrays.toString(arr));
            return;
        }
        int m=arr[0];
        int index =0;
        for (int i = 1; i <e ; i++) {
            if(arr[i]>m){
                m=arr[i];
                index =i;
            }
        }
        int t=arr[index];
        arr[index]=arr[e-1];
        arr[e-1]=t;

        Selection(arr,e-1);
    }
}
