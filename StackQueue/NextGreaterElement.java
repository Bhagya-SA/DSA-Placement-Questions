import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {
    public static int[] nextGreater(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {4, 5, 2, 25};
        int[] res = nextGreater(nums);
        System.out.println(Arrays.toString(res));
    }
}

/*
Optimal Approach: Use stack to track indices, single pass
Time Complexity: O(n)
Space Complexity: O(n)
*/
