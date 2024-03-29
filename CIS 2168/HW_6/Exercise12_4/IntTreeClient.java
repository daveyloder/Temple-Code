package HW_6.Exercise12_4;

public class IntTreeClient {
    public static void main(String[] args) {
        IntTree intTree = new IntTree(4);
        intTree.printSideways();
        System.out.println();
        System.out.println("Total levels: " + intTree.countLevels());
        System.out.println("Total leaves: " + intTree.countLeaves());

    }
}
