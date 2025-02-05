package LinkList.DoubliLL;

public class DLLMain {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.addFirst(22);
        list.addFirst(33);
        list.addFirst(44);
        list.addFirst(55);
        list.addLast(99);
        list.insertAfter(303,330);
        list.diplay();


    }
}
