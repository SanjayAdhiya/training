package java8features;

import java.util.Comparator;

public class Lambdawithcomperato {
	public static void one() {
		Comparator<Person> byAge = (Person p1, Person p2) -> p1.getAge().compareTo(p2.getAge());
	}


}
