import java.util.*;

public class TopKFrequentElements {
	public static int[] topKFreqElements(int[] nums, int k) {
		if(nums.length == k) return nums;

        Map<Integer, Integer> map = new HashMap<>();

        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for(int n: map.keySet()) {
            heap.add(n);

            if(heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for(int i=0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 2, 3};
		int k = 2;

		int[] ans = topKFreqElements(nums, k);

		System.out.println("Frequent Elements: ");
		System.out.print("[");
		for(int n: ans) {
			System.out.print(" " + n + " ");
		}
		System.out.print("]");
		System.out.println();
	}
}
