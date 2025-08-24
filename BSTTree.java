public class BSTTree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public BSTTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    Node delete(Node node, int data) {
        if (node == null)
            return null;
        if (data < node.data) {
            node.left = delete(node.left, data);
        } else if (data > node.data) {
            node.right = delete(node.right, data);
        } else {

            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.data = minValue(node.right);
            node.right = delete(node.right, node.data);
        }
        return node;
    }

    int minValue(Node node) {
        int minv = node.data;
        while (node.left != null) {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

    public void inorder() {
        inorder(root, "root");
    }

    public void preorder() {
        preorder(root, "root");
    }

    public void postorder() {
        postorder(root, "root");
    }

    public void inorder(Node n1, String pos) {
        if (n1 == null) {
            return;
        }
        inorder(n1.left, "left child of " + n1.data);
        System.out.println("node " + n1.data + " is " + pos);
        inorder(n1.right, "right child of " + n1.data);
    }

    public void preorder(Node n1, String pos) {
        if (n1 == null) {
            return;
        }
        System.out.println("node " + n1.data + " is " + pos);
        preorder(n1.left, "left child of " + n1.data);
        preorder(n1.right, "right child of " + n1.data);
    }

    public void postorder(Node n1, String pos) {
        if (n1 == null) {
            return;
        }
        postorder(n1.left, "left child of " + n1.data);
        postorder(n1.right, "right child of " + n1.data);
        System.out.println("node " + n1.data + " is " + pos);
    }

    public boolean search(int data) {
        return search(root, data);
    }

    public boolean search(Node node, int data) {
        if (node == null)
            return false;
        if (node.data == data)
            return true;
        if (data < node.data)
            return search(node.left, data);
        else
            return search(node.right, data);
    }

}
