package HW_5;

import java.util.Stack;

public class BracketMatcher {

    private static class Bracket {
        char bracketType;
        int bracketPosition;

        Bracket(char type, int position) {
            bracketType = type;
            bracketPosition = position;
        }

        boolean matches(char c) {
            if (bracketType == '[' && c == ']')
                return true;
            if (bracketType == '{' && c == '}')
                return true;
            if (bracketType == '(' && c == ')')
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        String text = "(}}";
        // System.out.println("proccessing: " + text);

        Stack<Bracket> openingBrackets = new Stack<>();
        for (int position = 1; position <= text.length(); position++) {
            char next = text.charAt(position - 1);

            if (next == '(' || next == '[' || next == '{') {
                openingBrackets.push(new Bracket(next, position));

            } else if (next == ')' || next == ']' || next == '}') {
                if (openingBrackets.isEmpty() || !openingBrackets.pop().matches(next)) {
                    // System.out.println("If stack is empty or no match");
                    // Print the index of the first unmatched bracket
                    System.out.println(position);
                    return;

                }

            }

        }

        if (openingBrackets.isEmpty()) {
            // Print "Success" if the brackets are balanced
            System.out.println("Success");

        } else {

            // Print index of first unmatched opening bracket
            System.out.println(openingBrackets.pop().bracketPosition);

        }
    }
}
