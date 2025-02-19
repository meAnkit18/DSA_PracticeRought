package treePractice;

public class BinaryTree {

    public BinaryTree(){

    }
    private static class Node {
        private int data;
        private Node left;
        private Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    private Node root;
}
