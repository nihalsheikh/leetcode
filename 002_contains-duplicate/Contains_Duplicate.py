def contains_duplicate(nums_arr):
	# Method 1
	# arr_set = set()
	# for num in nums_arr:
	# 	if num in arr_set:
	# 		return True
	# 	arr_set.add(num)
	# return False

	# Method 2
	return len(nums_arr) != len(set(nums_arr))


def main():
	nums = [1, 2, 3, 1]
	print("Contains Duplicates: ", contains_duplicate(nums))


if __name__ == "__main__":
	main()
