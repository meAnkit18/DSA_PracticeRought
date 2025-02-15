package rought;

public class Main {
    static int ans =0;
    static void pi(int n){
        if(n==0){
            return;
        }
        int r = n%10;
        ans = ans*10+r;
        pi(n/10);
    }
    public static void main(String[] args) {
       int n=512;
        pi(n);
        System.out.println("Reverse is: "+ ans);

    }

}