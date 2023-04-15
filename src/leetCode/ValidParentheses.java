package leetCode;

import java.util.Stack;

// My Solution
public class ValidParentheses {
    public boolean isValid(String s){
        if (s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){
            Character item = s.charAt(i);
            if (item == '(' || item == '{' || item == '[')
                stack.push(item);
            else if (stack.isEmpty()) return false;
            else if (item == ')' || item == '}' || item == ']'){
                if ((item == ')') && (stack.peek() != '(')) return false;
                else if ((item == '}') && (stack.peek() != '{')) return false;
                else if ((item == ']') && (stack.peek() != '[')) return false;

                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;

        return true;
    }
}
