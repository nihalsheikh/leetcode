from collections import defaultdict

def group_anagrams(strs):
	if len(strs) == 0: return []

	# Automatically assigning a default value to keys that do not exist
	map = defaultdict(list)

	for s in strs:
		word = "".join(sorted(s))
		map[word].append(s)

	return list(map.values())

def main():
	strs = ["eat","tea","tan","ate","nat","bat"]
	print(f"Group Anagrams:", group_anagrams(strs))


if __name__ == "__main__":
	main()
