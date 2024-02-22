package Feb_21_2024;

public class StackClient {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] input = { "to", "be", "or", "not", "to", "-", "be", "-", "-", "that", "is", "the", "-" };
        for (String s : input) {
            if (!s.equals("-")) {
                stack.push(s);
            } else if (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.print("(" + stack.size() + " left on the stack)");
        }
    }
}
