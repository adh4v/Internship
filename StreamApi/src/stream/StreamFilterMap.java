package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamFilterMap {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Akil","Adhi","Zoro","Santhosh","Tharun","Zoro");
		List<String> fil = list.stream().filter(t->t.startsWith("A")).collect(Collectors.toList());
		List<String> l = list.stream().map(t->t.replace("Z", "B")).collect(Collectors.toList());
		List<String> lk = list.stream().map(String::toUpperCase).toList();
		List<Integer> num = Arrays.asList(21,22,76,90,7);
		int sum = num.stream().reduce(0,(a,b)->a+b);
		long count = list.stream().count();
		System.out.println("Characters starting with letter A : "+fil);
		System.out.println("Replacing an Character : "+l);
		System.out.println("ToUppercase : "+lk);
		System.out.println("Count : "+count);
		System.out.println("Sum : "+sum);
	}
}
