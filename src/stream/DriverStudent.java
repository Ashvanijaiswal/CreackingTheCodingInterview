package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DriverStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Strudent arr[]= {new Strudent(10,70,"abc"),
						 new Strudent(101, 80, "bcd"),
						 new Strudent(102, 90, "efg")
		};
		double avg=Arrays.stream(arr).mapToInt(x->x.getMarks()).average().getAsDouble();
		System.out.println(avg);
		List <Strudent> l=Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(l.get(0));
	}

}
