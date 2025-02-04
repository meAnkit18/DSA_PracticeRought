package LinkList.test;

public class Main {
    public static void main(String[] args) {
        LL a = new LL();
        a.addFirst(22);
        a.addFirst(18);
        a.addFirst(7);
        a.addFirst(1006);
        a.addLast(99);
        a.addAt(88,0);
        a.addAt(77,6);
        a.addAt(666,2);

        a.diplay();
    }

}
