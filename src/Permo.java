public class Permo {
    public static void main(String[] args) {
        permutaton("","abc");
        System.out.println(c);
    }
    static int c = 0;
    static void permutaton(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }else {
            char ch = up.charAt(0);

            for (int i = 0; i <= p.length(); i++) {
                String f = p.substring(0,i);
                String s = p.substring(i,p.length());
                permutaton(f + ch + s,up.substring(1));
                c++;
            }
        }
    }
}
