package rought;

public class wdnin {
    public static void main(String[] args) {
        Solution("", "abc");
    }
    static void Solution(String first, String socond){

        if(socond.isEmpty()){
            System.out.println(first);
            return;
        }else {
            char ch = socond.charAt(0);

            Solution(first + ch, socond.substring(1));
            Solution(first, socond.substring(1));
        }
    }
}
