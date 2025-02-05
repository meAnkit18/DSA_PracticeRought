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
        Node node  = new Node(val);
        if(head == null){
            head = node;
            node.prev=null;
            return;
        }

        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        tail = last;
        tail.next=null;
     }
//   public void insertAfter(int data , int val){
//        Node node = new Node(val);
//        Node nodeat = head;
//        while (nodeat.value != data){
//            nodeat = nodeat.next;
//        }
//        if(nodeat == null){
//            System.out.println("Given Node is not Exist");
//            return;
//       }
//
//
//       Node after  = nodeat.next;
//        Node forpre = nodeat;
//        nodeat.next = node;
//        node.prev = forpre;
//        node.next = after;
//        after.prev = node;
////        after.next =null;
//
//    }
//
//     }

    public void insertAfter(int data, int val) {
        Node node = new Node(val);
        Node nodeat = head;

        // Find the node with value 'data' while checking for null
        while (nodeat != null && nodeat.value != data) {
            nodeat = nodeat.next;
        }

        // If 'data' is not found
        if (nodeat == null) {
            System.out.println("Given Node does not exist");
            return;
        }

        // Insert after 'nodeat'
        Node after = nodeat.next;

        nodeat.next = node;
        node.prev = nodeat;
        node.next = after;

        // If 'after' exists, update its 'prev' pointer
        if (after != null) {
            after.prev = node;
        }
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
