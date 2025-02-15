package rought;

public class PatternURecur {
    public static void main(String[] args) {
        int n = 4;
        Pattern(n,1);
    }
    static void Pattern(int n,int c){
        if(n>c){
            System.out.print("* ");
            Pattern(n,c+1);

        }
        if(n==c){
            System.out.println("* ");
            Pattern(n-1,1);

        }
        if (n==1){
            return;
        }

    }
}
