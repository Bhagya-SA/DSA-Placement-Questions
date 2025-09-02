import java.util.LinkedList;

public class ImplementStack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T val){
        list.addFirst(val);
    }

    public T pop(){
        if(list.isEmpty()) throw new RuntimeException("Stack is empty");
        return list.removeFirst();
    }

    public T peek(){
        if(list.isEmpty()) throw new RuntimeException("Stack is empty");
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public static void main(String[] args){
        ImplementStack<Integer> stack = new ImplementStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20
        System.out.println(stack.peek()); // 10
    }
}

/*
Optimal Approach: Use LinkedList for stack operations
Time Complexity: push/pop/peek - O(1)
Space Complexity: O(n)
*/
