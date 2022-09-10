
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> holder = new Stack<Character>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    holder.push(')');
                    break;
                case '[':
                    holder.push(']');
                    break;
                case '{':
                    holder.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (c == holder.peek()) {
                        holder.pop();
                    }
                    break;
            }

        }
        if (!holder.isEmpty()) {
            return false;
        }
        return true;
    }

}
