public class ReverseString {
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args){
        String s = "HelloWorld";
        System.out.println("Reversed: " + reverse(s));
    }
}

/*
Optimal Approach: Two-pointer swap in char array
Time Complexity: O(n)
Space Complexity: O(n) - for char array (can be O(1) using StringBuilder in-place)
*/
