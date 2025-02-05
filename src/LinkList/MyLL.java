package LinkList;

import inheritence.LL;

public class MyLL {
    private Node head;
    private Node tail;
    private int size;
    public MyLL(){
        this.size = 0;
    }
    public void shot(){
        Node node = head;
        while (node.next !=null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                node = node.next;
            }else {
                node = node.next;
            }

            tail = node;
            tail.next = null;
        }
    }
    public void insetFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        if (tail== null){
            insetFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertAt(int val , int index){
        if(index == 0){
            insetFirst(val);
            return;
        }

        if (index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;

        }

        Node node = new Node(val);
        temp.next = node;
        size++;
    }

    public void display(){
        Node t = head;
        while (t != null){
            System.out.print(t.value + "-->");
            t = t.next;
        }


    }

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
