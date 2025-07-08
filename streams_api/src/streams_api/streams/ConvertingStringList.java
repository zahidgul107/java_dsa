package streams_api.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertingStringList {
	public static void main(String[] args) {
		List<String> nameList = Stream.of("Ram", "Shyam", "herry", "Sachin")
				.collect(Collectors.toList());
		
		System.err.println(toUpperCase(nameList));
	}

	private static List<String> toUpperCase(List<String> nameList) {
		return nameList.stream().map(String::toUpperCase).collect(Collectors.toList()) ;
	}
}
