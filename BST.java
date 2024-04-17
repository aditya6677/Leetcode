class BST {
    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public BST(int val) {
        root = new Node(val);
    };

    public void insert(int val){
        if (root == null) {
            root = new Node(val);
            return;
        }
        insert(root, val);
    }

    public void insert(Node node, int x) {
        if (x < node.value) {
            if (node.left == null) {
                node.left = new Node(x);
            } else {
                insert(node.left, x);
            }
        }
        if (x > node.value) {
            if (node.right == null) {
                node.right = new Node(x);
            } else {
                insert(node.right, x);
            }
        }
    }

    public void display(Node root, int space) {
        if (root == null) {
            return;
        }
        space += 5;
        display(root.right, space);
        System.out.print("\n");
        for (int i = 5; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(root.value + "\n");
        display(root.left, space);
    }
}