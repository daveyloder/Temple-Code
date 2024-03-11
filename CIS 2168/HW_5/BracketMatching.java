package HW_5;

public class BracketMatching {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((top == '[' && ch != ']') || (top == '(' && ch != ')')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String example = "[]";
        boolean result = isBalanced(example);
        System.out.println("Is balanced: " + result);
    }
}
