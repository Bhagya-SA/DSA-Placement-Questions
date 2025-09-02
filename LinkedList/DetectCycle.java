class ListNodeCycle {
    int val;
    ListNodeCycle next;
    ListNodeCycle(int val){ this.val = val; }
}

public class DetectCycle {
    public static boolean hasCycle(ListNodeCycle head){
        ListNodeCycle slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args){
        ListNodeCycle head = new ListNodeCycle(1);
        head.next = new ListNodeCycle(2);
        head.next.next = new ListNodeCycle(3);
        head.next.next.next = head.next; // create cycle
        System.out.println("Has cycle? " + hasCycle(head));
    }
}

/*
Optimal Approach: Floyd’s Tortoise and Hare algorithm
Time Complexity: O(n)
Space Complexity: O(1)
*/
