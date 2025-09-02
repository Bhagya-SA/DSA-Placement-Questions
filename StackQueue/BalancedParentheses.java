import java.util.Stack;

public class BalancedParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c == ')' && top != '(') || 
                   (c == '}' && top != '{') || 
                   (c == ']' && top != '['))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "{[()]}";
        System.out.println("Balanced? " + isValid(s));
    }
}

/*
Optimal Approach: Stack to match opening and closing brackets
Time Complexity: O(n)
Space Complexity: O(n)
*/
