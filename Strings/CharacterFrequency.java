import java.util.HashMap;

public class CharacterFrequency {
    public static void frequency(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : map.keySet()){
            System.out.println(c + ": " + map.get(c));
        }
    }

    public static void main(String[] args){
        String s = "hello world";
        frequency(s);
    }
}

/*
Optimal Approach: Use HashMap to count frequencies
Time Complexity: O(n)
Space Complexity: O(n) - HashMap storage
*/
