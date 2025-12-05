public class ValidAnagrams {
	public static boolean validAnagrams(String s, String t) {
		if(s.length() != t.length()) return false;

		int[] chars = new int[26];

		for(int i = 0; i< s.length(); i++) {
			chars[s.charAt(i) - 'a']++;
			chars[t.charAt(i) - 'a']--;
		}

		for(int ch: chars) {
			if(ch != 0) return false;
		}

		return true;
	}
	public static void main(String[] args) {
		String s = "garage";
		String t = "ragega";

		System.out.println("Is Anagram ? " + validAnagrams(s, t));
	}
}
