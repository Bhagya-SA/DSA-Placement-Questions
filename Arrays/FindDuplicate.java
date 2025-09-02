import java.util.HashSet;

public class FindDuplicate {
    public static int findDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return num;
            set.add(num);
        }
        return -1; // No duplicate found
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        System.out.println("Duplicate: " + findDuplicate(nums));
    }
}

/*
Optimal Approach: Use HashSet to track seen elements
Time Complexity: O(n)
Space Complexity: O(n)

Alternative Optimal (Floyd’s Tortoise & Hare):
Time Complexity: O(n)
Space Complexity: O(1)
*/
