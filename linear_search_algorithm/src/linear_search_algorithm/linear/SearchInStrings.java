package linear_search_algorithm.linear;

public class SearchInStrings {

	public static void main(String[] args) {
		String name = "Kunal";
		char target = 'd';
		System.err.println(search(name, target));

	}
	
	static boolean search2(String name, char target) {
		if (name.length() == 0) {
			return false;
		}
		
		for(int i = 0; i < name.length(); i++) {
			if(target == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean search(String name, char target) {
		if (name.length() == 0) {
			return false;
		}
		
		for(int i = 0; i < name.length(); i++) {
			if(target == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
