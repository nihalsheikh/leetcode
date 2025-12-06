import java.util.*;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		// Handle edge case, if empty strs array
        if(strs.length == 0) return new ArrayList<>();

        // HashMap to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Make every string and array in itself
            char[] arr = s.toCharArray();

            // Sort every string array
            Arrays.sort(arr);

            // key for string
            String key = new String(arr);

            // add string to map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println("Group Anagrams:");
		System.out.println(groupAnagrams(strs));
	}
}
