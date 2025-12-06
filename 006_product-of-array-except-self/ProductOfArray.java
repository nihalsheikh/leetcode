import java.util.*;

public class ProductOfArray {
	public static int[] productOfArrayElement(int[] nums) {
		int[] res = new int[nums.length];

        Arrays.fill(res, 1);

        int pre = 1, post = 1;

        for(int i = 0; i < nums.length; i++) {
            res[i] = pre;
            pre *= nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] *= post;
            post *= nums[i];
        }

        return res;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] res = productOfArrayElement(nums);

		System.out.println("Product of array elements: ");
		System.out.print("[");
		for(int i=0; i<res.length; i++) {
			System.out.print(" " + res[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
}
