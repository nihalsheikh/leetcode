import java.util.*;

public class ContainsDuplicatesII {
	public static boolean containsDuplicateII(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; ++i) {
			if(map.containsKey(nums[i])) {
				return true;
			}
			map.put(nums[i], i);
			if(map.size() > k) {
				map.remove(nums[i - k]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {0, 5, 2, 4, 5, 3, 1};
		int k = 3;

		System.out.println("Contains Duplicate: " + containsDuplicateII(nums, k));
	}
}
