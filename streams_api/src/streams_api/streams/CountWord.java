package streams_api.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountWord {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("java python java html", "java java css html", "hadoop spark java");
		System.err.println(countParticularWord(list));
	}

	private static long countParticularWord(List<String> list) {
		return list.stream()
				.flatMap(word -> Arrays.stream(word.split(" ")))
				.filter(w -> "java".equalsIgnoreCase(w))
				.count();
	}

}
