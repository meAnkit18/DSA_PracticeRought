package rought;

public class SkipYouTube {
    public static void main(String[] args) {
//        System.out.println(SkipYoutube("MY name is Youtube"));
        System.out.println(SkipYounotTube("MY name is Youtuba"));
    }
    static String SkipYoutube(String str){
        if(str.isEmpty()){
            return "";
        }

        if (str.startsWith("Youtube")){
            return SkipYoutube(str.substring(7));
        }else {
            char ch = str.charAt(0);
            return ch + SkipYoutube(str.substring(1));
        }
    }

    static String SkipYounotTube(String str){
        if(str.isEmpty()){
            return "";
        }

        if (str.startsWith("You") && !str.startsWith("Youtube")){
            return SkipYounotTube(str.substring(3));
        }else {
            char ch = str.charAt(0);
            return ch + SkipYounotTube(str.substring(1));
        }
    }
}
