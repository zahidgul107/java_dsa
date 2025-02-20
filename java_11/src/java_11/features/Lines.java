package java_11.features;

import java.util.List;
import java.util.stream.Collectors;

public class Lines {

	public static void main(String[] args) {
		
		String str = "dell\nhp\nlenovo";
		
		System.err.println(str);
		List<String> list = str.lines().collect(Collectors.toList());
		System.err.println(list);

	}

}
