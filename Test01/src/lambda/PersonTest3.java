package lambda;

import java.util.ArrayList;
import java.util.List;

public class PersonTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = createPeople();
		double avgHeight = people.stream()
		        .filter(p -> p.getName().indexOf("3") > 0)
				.mapToDouble(p -> p.getHeight())
				.average()
				.getAsDouble();
		System.out.println("含3的平均身高："+avgHeight+"m");

	}

	static List<Person> createPeople() {
		List<Person> people = new ArrayList<>();
		Person p1 = new Person("x1", Person.Sex.male, 23, 1.89);
		people.add(p1);
		Person p2 = new Person("x32", Person.Sex.female, 25, 1.69);
		people.add(p2);
		Person p3 = new Person("x33", Person.Sex.male, 22, 1.79);
		people.add(p3);
		Person p4 = new Person("x4", Person.Sex.female, 27, 1.59);
		people.add(p4);
		return people;
	}

}
