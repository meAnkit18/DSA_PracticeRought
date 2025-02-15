package rought;

public class LinearSearchRec {
    public static void main(String[] args) {
        int arr[]= {1,5,3,8,2,4,5,67,34};
        int t=7;
        int and=LineSearch(arr,t,0);
        System.out.println(and);
    }
    static int LineSearch(int arr[],int t, int index){
        if (index == arr.length){
            return -1;
        }
        else if(arr[index]==t){
            return index;
        }
        return LineSearch(arr,t,index+1);
    }
}
