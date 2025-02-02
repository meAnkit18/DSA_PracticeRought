public class Q1ofString {
    public static void main(String[] args) {
        Skip("","Aman");

    }
    static void Skip(String pivoet, String old){
        if(old.isEmpty()){
            System.out.println(pivoet);
            return;
        }

        char ch = old.charAt(0);
        if(ch == 'a' || ch == 'A'){
            Skip(pivoet, old.substring(1));
        }else {
            Skip(pivoet + ch,old.substring(1));
        }
    }
}
