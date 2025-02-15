package rought;

public class max {
    public static void main(String[] args) {
        int arr[] = {1,4,32,6,84,3,2,5,7};
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>m){
                m = arr[i];
            }
        }
        System.out.println(m);
    }
}
