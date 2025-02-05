package LinkList.test;

public class LL {
    private Node head;
    private Node tail;
    private int size;
     LL(){
        this.size = 0;
    }

    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }


        size++;
    }
//    public void addrecu(int val, int index){
//         head = insertRecu(val,index,head);
//    }
//
//    private Node insertRecu(int val,int index,Node nn){
//         if(index == 0){
//             Node temp = new Node(val, nn);
//             return temp;
//         }
//
//         nn.next=insertRecu(val,index-1,nn.next);
//         return nn;
//
//    }
    public void addAt(int val, int index){

         if(index == 0){
             addFirst(val);
             return;
         }

         if (index == size){
             addLast(val);
             return;
         }

        size++;
         Node temp ;
         Node value = new Node(val);
         Node pointer = head;
        for (int i = 1; i <index ; i++) {
            pointer = pointer.next;
        }
        temp = pointer.next;
        pointer.next = value;
        value.next=temp;


    }
    public void inseturec(int val,int index){
         head = insertrecu( val, index, head);
    }
    private Node insertrecu(int val,int index,Node node){
         if (index == 0){
             Node temp = new Node(val,node);
             return temp;
         }
         node.next = insertrecu(val,index-1,node.next);
         return node;
    }

    public  void addLast(int val){
        if(tail == null){
            addFirst(val);
            size++;
            return;
        }else {
            Node t = new Node(val);
            tail.next=t;
            tail = t;
            size++;
        }
    }
    public void diplay(){
        Node t = head;
        while (t != null){
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("[Size : "+ size+']');
    }

    private class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
