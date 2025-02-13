package SegmentTrees;

public class segmenttrees {
    public class Node{
        int data;
        int startinginterval;
        int endinterval;
        Node left;
        Node right;
        public Node(int startinginterval,int endinterval){
            this.startinginterval = startinginterval;
            this.endinterval = endinterval;
        }

    }

    Node root;

    public segmenttrees(int arr[]){
        this.root = costructTree(arr,0,arr.length-1);
    }

    private Node costructTree(int arr[], int start, int end){
        if (start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node  = new Node(start, end);
        int m = (start+end)/2;
        node.left = costructTree(arr, start,m);
        node.right = costructTree(arr, m+1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }
    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi,int qei){
        if(node.startinginterval >=qsi && node.endinterval <=qei){
            return node.data;
        }else if (node.startinginterval >qei || node.endinterval<qsi){
            return 0;
        }else {
            return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei);
        }
    }


    private void update(int index, int value){
        this.root.data = update(this.root, index, value);
    }
    private int update(Node node, int index, int value){
        if (index >= node.startinginterval && index<= node.endinterval ){
            if (index == node.startinginterval && index == node.endinterval){
                node.data = value;
                return node.data;
            }else {
                int left = update(node.left,index,value );
                int right = update(node.right,index,value);
                node.data= left+right;
                return node.data;
            }
        }
        return node.data;
    }
}
