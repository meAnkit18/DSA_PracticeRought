public class MainClass {
    public static void main(String[] args) {



        Student pivoet = new Student();
//        pivoet.name = "Ankit";
        pivoet.roll = 50;
        pivoet.marks=50.5f;

        Student one   = pivoet;
        one.name = "ALka";

        System.out.println(pivoet.name);
        System.out.println(one.roll);
        System.out.println(one.marks);

    }
    static class Student{
        String name;
        int roll;
        float marks;

    }
}
