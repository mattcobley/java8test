package Java8Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8TestStreams {

	public static void main(String[] args) {

		List<String> coll = Arrays.asList("one", "", "two", "", "three");
		List<String> numbers = coll.stream().filter(el -> !el.isEmpty()).collect(Collectors.toList());
		numbers.forEach(System.out::println);
		
		List<String> numbers2 = coll.parallelStream().filter(el -> !el.isEmpty()).collect(Collectors.toList());
		numbers2.forEach(number -> System.out.println(number));
		
		Random random = new Random();
		random.ints().limit(10).sorted().filter(num -> num > 4).forEach(System.out::println);
		
		List<Integer> lengths = coll.stream().map(num -> num.length())
				.distinct().collect(Collectors.toList());
		lengths.stream().forEach(System.out::println);
		Long collCount = lengths.stream().count();
		
		String lengths2 = coll.stream().map(num -> num)
				.distinct().collect(Collectors.joining(","));
		System.out.println(lengths2);
		
		
		IntSummaryStatistics summary = lengths.stream().mapToInt(num -> num).summaryStatistics();
		System.out.println(summary.getMax());
		System.out.println(summary.getMin());
		System.out.println(summary.getSum());
		System.out.println(summary.getAverage());
		
		String stuff = getString(coll, ";");
	}
	
	public static String getString(List<String> input, String separator) {
		StringBuilder stringBuilder = new StringBuilder();
		
	      for(String string: input) {
			
	         if(!string.isEmpty()) {
	            stringBuilder.append(string);
	            stringBuilder.append(separator);
	         }
	      }
	      String mergedString = stringBuilder.toString();
	      return mergedString.substring(0, mergedString.length()-2);
	}

}
