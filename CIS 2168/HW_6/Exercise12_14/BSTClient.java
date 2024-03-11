package HW_6.Exercise12_14;

public class BSTClient {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);
        bst.add(6);
        bst.add(8);

        System.out.println("Level-Order Traversal:");
        bst.levelOrder();
    }
}
