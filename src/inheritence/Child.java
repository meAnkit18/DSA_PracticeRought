package inheritence;


public class Child {
    public static void main(String[] args) {
//       Parent chiled1 = new Parent("Ankit",18,true);
//        System.out.println(chiled1.name);
        children child1 = new children("Virat Kohli",37,true,9.9f);
//        System.out.println(child1.GetString("Ankit"));

    }
    static  class children extends Parent{
        float cgpa;
        children(String name,int age,boolean married,float cgpa){
            super(name,age,married);
            this.cgpa = cgpa;
        }

    }
}
