class ListNode {
    int val;
    ListNode next;
    ListNode(int val){ this.val = val; }
}

public class ReverseLinkedList {
    public static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head = reverse(head);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

/*
Optimal Approach: Iterative reversal using three pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/
