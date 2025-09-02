class ListNodeDup {
    int val;
    ListNodeDup next;
    ListNodeDup(int val){ this.val = val; }
}

public class RemoveDuplicates {
    public static ListNodeDup removeDuplicates(ListNodeDup head){
        ListNodeDup current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNodeDup head = new ListNodeDup(1);
        head.next = new ListNodeDup(1);
        head.next.next = new ListNodeDup(2);
        head.next.next.next = new ListNodeDup(3);
        head.next.next.next.next = new ListNodeDup(3);

        head = removeDuplicates(head);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

/*
Optimal Approach: Iterative traversal for sorted linked list
Time Complexity: O(n)
Space Complexity: O(1)
*/
