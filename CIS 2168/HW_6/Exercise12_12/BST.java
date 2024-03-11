package HW_6.Exercise12_12;

import java.util.*;

public class BST<Key extends Comparable> {
    private Node root;

    private class Node {
        Key key;
        Node left, right;

        public Node(Key key) {
            this(key, null, null);
        }

        public Node(Key key, Node left, Node right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }

    // Constructor: initializes an empty binary search tree
    public BST() {

    }

    // inserts a new node in the binary search tree
    public void add(Key key) {
        root = add(root, key);
    }

    // recursively adds a new node
    private Node add(Node node, Key key) {
        if (node == null)
            return new Node(key);
        int cmp = key.compareTo(node.key);
        if (cmp <= 0)
            node.left = add(node.left, key);
        else
            node.right = add(node.right, key);
        return node;
    }

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(Node node) {
        if (node == null)
            return;
        inorderHelper(node.left);
        System.out.printf("%s ", node.key);
        inorderHelper(node.right);
    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.key);
        preorderHelper(node.left);
        preorderHelper(node.right);

    }

    // begin porstorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    private void postorderHelper(Node node) {
        if (node == null) {
            return;
        }

        postorderHelper(node.left);
        postorderHelper(node.right);
        System.out.printf("%s ", node.key);
    }

    // contains method public and private helper
    public Key contains(Key key) {
        return containsHelper(root, key);
    }

    private Key containsHelper(Node node, Key key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node.key;
        } else if (cmp < 0) {
            return containsHelper(node.left, key);
        } else {
            return containsHelper(node.right, key);
        }
    }
}
