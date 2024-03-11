package HW_6.Exercise12_4;

import java.util.*;

public class IntTree {
    private Node root;

    // private node helper class
    private static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this(data, null, null);
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    // tree builder public and private method
    public IntTree(int size) {
        root = buildTree(1, size);
    }

    private Node buildTree(int n, int size) {
        if (n > size) {
            return null;
        } else {
            Node left = buildTree(2 * n, size);
            Node right = buildTree(2 * n + 1, size);
            return new Node(n, left, right);
        }
    }

    // inorder traversal public and private method
    public void inorderTraversal(Node node) {
        System.out.print("inorder: ");
        inorderHelper(root);
    }

    private void inorderHelper(Node node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(" " + node.data);
            inorderHelper(node.right);
        }
    }

    // preorder traversal public and private method
    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            preorderHelper(node.left);
            preorderHelper(node.right);
        }
    }

    // postorder traversal public and private method
    public void postorderTraversal(Node node) {
        postorderHelper(root);
    }

    private void postorderHelper(Node node) {
        if (node != null) {
            postorderHelper(node.left);
            postorderHelper(node.right);
            System.out.print(" " + node.data);
        }
    }

    // sum public and private method
    public int sum() {
        return sumHelper(root);
    }

    private int sumHelper(Node node) {
        if (node != null) {
            int leftSum = sumHelper(node.left);
            int rightSum = sumHelper(node.right);
            return node.data + leftSum + rightSum;
        }
        return 0;
    }

    // count levels public and private methods
    public int countLevels() {
        return countLevelsHelper(root);
    }

    private int countLevelsHelper(Node node) {
        if (node != null) {
            int leftLevels = countLevelsHelper(node.left);
            int rightLevels = countLevelsHelper(node.right);

            return 1 + Math.max(leftLevels, rightLevels);
        }
        return 0;
    }

    // count leaves public and private
    public int countLeaves() {
        return countLeavesHelper(root);
    }

    public int countLeavesHelper(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }
        int leftLeaves = countLeavesHelper(node.left);
        int rightLeaves = countLeavesHelper(node.right);

        return leftLeaves + rightLeaves;

        // if (node != null) {
        // int leftLeaves = countLeavesHelper(node.left);
        // int rightLeaves = countLeavesHelper(node.right);
        // return leftLeaves + rightLeaves;
        // }

        // return 0;
    }

    // Print sideways public and private method
    public void printSideways() {
        printSideways(root, 0);
    }

    private void printSideways(Node root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }

    // public static void main(String[] args) {
    // Node<Integer> root;
    // Node<Integer> two = new Node<>(2);
    // Node<Integer> three = new Node<>(3);

    // root = new Node<>(1, two, three);

    // System.out.println(root.data);
    // System.out.println(root.left.data);
    // System.out.println(root.right.data);
    // }

}
