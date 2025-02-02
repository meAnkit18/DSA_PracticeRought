public class count_number {
    public static void main(String[] args) {
        int c=0;
        int ans=count(100000004,c);
        System.out.println(ans);
    }
    static int count(int n,int c){
        if(n==0){
            return c;
        }
        int r= n%10;
        if(r==0){

            return count(n/10,c+1);
        }

        return count(n/10,c);

    }
}
