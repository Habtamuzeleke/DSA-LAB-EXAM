import java.util.Stack;

public class Mainn {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseStringUsingStack(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseStringUsingStack(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string must not be null");
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
