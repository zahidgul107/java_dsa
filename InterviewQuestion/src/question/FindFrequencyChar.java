package question;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyChar {

	public static void main(String[] args) {
		
		String s = "abbc";
		System.err.println(findFreqChar(s));

	}

	private static Map<Character, Integer> findFreqChar(String s) {


		char ch;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			System.err.println(ch);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		return map;
	}

}
