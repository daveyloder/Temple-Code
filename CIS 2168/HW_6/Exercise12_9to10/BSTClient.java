package HW_6.Exercise12_9to10;

public class BSTClient {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Integer[] keys = { 21, 68, 11, 13, 17, 97 };
        for (Integer key : keys) {
            bst.add(key);
        }
        bst.inorderTraversal();
        System.out.println();
        bst.preorderTraversal();
        System.out.println();
        bst.postorderTraversal();
    }
}
