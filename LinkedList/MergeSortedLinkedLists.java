class ListNodeMerge {
    int val;
    ListNodeMerge next;
    ListNodeMerge(int val){ this.val = val; }
}

public class MergeSortedLinkedLists {
    public static ListNodeMerge mergeTwoLists(ListNodeMerge l1, ListNodeMerge l2){
        ListNodeMerge dummy = new ListNodeMerge(0);
        ListNodeMerge tail = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void main(String[] args){
        ListNodeMerge l1 = new ListNodeMerge(1);
        l1.next = new ListNodeMerge(3);
        l1.next.next = new ListNodeMerge(5);

        ListNodeMerge l2 = new ListNodeMerge(2);
        l2.next = new ListNodeMerge(4);
        l2.next.next = new ListNodeMerge(6);

        ListNodeMerge merged = mergeTwoLists(l1, l2);
        while(merged != null){
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}

/*
Optimal Approach: Iterative merge using dummy node
Time Complexity: O(n + m) - n and m are lengths of lists
Space Complexity: O(1)
*/
