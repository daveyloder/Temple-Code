package HW_6.Exercise12_12;

public class BSTClient {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Integer[] keys = { 21, 68, 11, 13, 17, 97 };
        for (Integer key : keys) {
            bst.add(key);
        }
        System.out.println(bst.contains(21));
    }
}
