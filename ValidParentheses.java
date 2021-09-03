import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * input s= "()" is true;
 * input s = "(]" is false;
 * input s = "() [] {}" is true;
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
