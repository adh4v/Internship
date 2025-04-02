package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
	
	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("Adhav");
		name.add("Tharun");
		name.add("Karthick");
		name.add("Santhosh");
		name.add("Akilan");
		name.add("Adhav");
		List<String> distinctNSorted = name.stream().distinct().sorted().collect(Collectors.toList());
		distinctNSorted.forEach(t->System.out.println(t));
		
	}
}

