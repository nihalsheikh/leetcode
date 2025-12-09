import java.util.*;

public class LongestConsecutiveSequence {
	public static int longestConsecutiveSequence(int[] nums) {
		if(nums.length == 0) return 0;

		int longestSeq = 1;

		if (nums.length == 1) return longestSeq;

        HashSet<Integer> numSet = new HashSet<>();
        for(int n: nums) {
            numSet.add(n);
        }

        for(int n: numSet) {
            if(numSet.contains(n - 1)) {
                continue;
            } else {
                int currNum = n;
                int currSeqLen = 1;

                while(numSet.contains(currNum + 1)) {
                    currNum++;
                    currSeqLen++;
                }

                longestSeq = Math.max(longestSeq, currSeqLen);
            }
        }

        return longestSeq;
	}
	public static void main(String[] args) {
		int[] nums = {100,4,200,1,3,2};
		System.out.println("Longest Consecutive Sequence: " + longestConsecutiveSequence(nums));
	}
}
