import java.util.*;

public class VerifyAlienDictionary {
	public static boolean verifyAlienDictionary(String[] w, String o) {
		Map<Character, Integer> orderMap = new HashMap<>();
        for (int i=0; i < o.length(); i++)
            orderMap.put(o.charAt(i), i);

        for(int i=0; i < w.length - 1; i++) {
            for(int j = 0; j < w[i].length(); j++) {
                if(j >= w[i+1].length()) return false;

                if(w[i].charAt(j) != w[i+1].charAt(j)) {
                    int currLetter = orderMap.get(w[i].charAt(j));
                    int nextLetter = orderMap.get(w[i+1].charAt(j));

                    if(currLetter > nextLetter) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }

		return true;
	}
	public static void main(String[] args) {
		String[] w = {"hello","leetcode"};
		String o = "hlabcdefgijkmnopqrstuvwxyz";

		System.out.println("Is alien dictionary? " + verifyAlienDictionary(w, o));
	}
}
