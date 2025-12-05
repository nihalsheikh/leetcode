def valid_anagrams(s, t):
	if len(s) != len(t): return False

	chars = [0] * 26

	for i in range(len(s)):
		chars[ord(s[i]) - ord("a")] += 1
		chars[ord(t[i]) - ord("a")] -= 1

	for char in chars:
		if char != 0: return False

	return True

def main():
	s = "cat"
	t = "tac"
	print("Is Anagram ? ", valid_anagrams(s = "garage", t = "ragage"))


if __name__ == "__main__":
	main()
