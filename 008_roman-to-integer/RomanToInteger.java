import java.util.*;

public class RomanToInteger {
	static Map<String, Integer> values = new HashMap<>();
	static {
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);
    }

	public static int romanToInt(String s) {
		int sum = 0;
        int string_count = 0;

        while(string_count < s.length()) {
            if(string_count < s.length() - 1) {
                String twoChars = s.substring(string_count, string_count+2);

                if(values.containsKey(twoChars)) {
                    sum += values.get(twoChars);
                    string_count += 2;
                    continue;
                }
            }

            String oneChar = s.substring(string_count, string_count+1);
            sum += values.get(oneChar);
            string_count += 1;
        }

        return sum;
	}
	public static void main(String[] args) {
		String s = "III";

		int ans = romanToInt(s="IX");
		System.out.println("Integer of " + s + ": " + ans);
	}
}
