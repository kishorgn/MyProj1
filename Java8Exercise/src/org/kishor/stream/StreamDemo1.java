package org.kishor.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> persons = new ArrayList<Person>();
		persons.add(new Person("John", "m", 40));
		persons.add(new Person("Martina", "f", 37));
		persons.add(new Person("Sam", "m", 7));
		persons.add(new Person("Stephen", "m", 38));
		persons.add(new Person("Clara", "f", 10));
		persons.add(new Person("Abel", "m", 7));
		
		System.out.println(persons);
		
		Stream<Person> personStream = persons.stream();
		
		personStream.forEach(t -> System.out.println(t));
		
		personStream.close();
		
		personStream = persons.stream();
		
		System.out.println("Sum of age : "+
		personStream.filter(p -> p.getGend().equals("m"))
					.mapToDouble(p->p.getAge())
					.sum()
				);
	}

}
