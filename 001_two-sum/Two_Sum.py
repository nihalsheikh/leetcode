def twoSum(nums: list, target: int) -> list[int, int]:
	map = {}

	for indx, val in enumerate(nums):
		if (target - val) in map:
			return [map.get(target - val), indx]

		map[val] = indx

	return []


def main():
	nums = [2,7,11,15]
	target = 9

	print(f"Solution: {twoSum(nums, target)}")



if __name__ == "__main__":
	main()
