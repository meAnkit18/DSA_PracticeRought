package rought;

public class Q1SringRetu {
    public static void main(String[] args) {
        System.out.println(Skip("aaaabbbccc"));
    }
    static String Skip(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch == 'a' || ch == 'A'){
            return Skip(str.substring(1));
        }else {
            return ch + Skip(str.substring(1));
        }
    }
}
