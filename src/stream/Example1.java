package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {30,20,10};
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		Stream.iterate(1, x->x+1).filter(x->x.toString().contains("5")).limit(10).forEach(System.out::println);
		String str[]= {"abc","cde","acd","aec","xyz"};
		Arrays.stream(str).filter(s-> s.startsWith("a")).filter(s-> s.endsWith("c")).sorted().forEach(System.out::println);
	}

}
