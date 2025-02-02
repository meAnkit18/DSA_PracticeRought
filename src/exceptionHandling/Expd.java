package exceptionHandling;

public class Expd {
    public static void main(String[] args) {
        int a =10;
        int b=0;

        try{
            divide(a,b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Mai to hamesa aunga chuttiye");
        }
    }

    private static int divide(int a, int b) {
        return a/b;
    }
}
