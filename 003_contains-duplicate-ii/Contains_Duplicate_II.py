def contains_duplicate_ii(nums, k):
	s = set()
	for inx, val in enumerate(nums):
		if val in s: return True;
		s.add(val)
		if len(s) > k: s.remove(nums[inx - k])
	return False


def main():
	nums = [0, 5, 2, 4, 5, 3, 1, 6]
	k = 3
	print("Contains Duplicate: ", contains_duplicate_ii(nums, k))


if __name__ == "__main__":
	main()
