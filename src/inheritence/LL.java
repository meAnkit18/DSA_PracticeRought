package inheritence;

public class LL {

        Node head;
        Node tail;
        void shot(){
            Node node = head;
            while (node.next !=null) {
                if (node == node.next) {
                    node.next = node.next.next;
                }
            }
        }

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }

            Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
}
