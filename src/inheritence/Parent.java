package inheritence;

public class Parent {
private String name;
    int age;
    boolean married;
    public void GetString (String namu){
        this.name=namu;
    }
    Parent(String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }
}
