def products_of_elements(nums):
	res = [1] * len(nums)
	pre = 1
	post = 1

	for i in range(len(nums)):
		res[i] = pre
		pre *= nums[i]

	n = len(nums) - 1
	while n >= 0:
		res[n] *= post
		post *= nums[n]
		n -= 1

	return res

def main():
	nums = [1, 2, 3, 4]
	print(products_of_elements(nums))


if __name__ == "__main__":
	main()
