package LinkList.DoubliLL;

public class DLL {
     private Node head;
     private Node tail;
     private int size;

    public void addFirst(int val){
         Node node = new Node(val);
         node.next = head;
         node.prev = null;
         if (head != null){
             head.prev = node;
         }

         head = node;
         size++;
     }

     public void diplay(){
        Node n = head;
        Node last = null;
        while (n != null){
            System.out.print(n.value+ " -> ");
            last = n;
              n = n.next;
        }
         System.out.println();
         System.out.println("After reverse ::");

         while (last != null){
             System.out.print(last.value + " <- ");
             last = last.prev;
         }
         System.out.println();
     }

     public void addLast(int val){

     }


     private class Node{
         private int value;
         private Node next;
         private Node prev;

         private Node(int value){
             this.value = value;
         }
         private Node(int val, Node next, Node prev){
             this.value = val;
             this.next = next;
             this.next = prev;
         }
     }
}
