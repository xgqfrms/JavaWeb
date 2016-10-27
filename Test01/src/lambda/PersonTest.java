package lambda;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class PersonTest {

	public static void main(String[] args) {
		// 集合初始化
		List<Person> people = createPeople();
		Stream<Person> stream = people.stream();
		stream.forEach(p -> System.out.println(p.toString()));
	}

	static List<Person> createPeople() {
		List<Person> people = new ArrayList<>();
		Person p1 = new Person("x1", Person.Sex.male, 23, 1.89);
		people.add(p1);
		Person p2 = new Person("x2", Person.Sex.female, 25, 1.69);
		people.add(p2);
		Person p3 = new Person("x3", Person.Sex.male, 22, 1.79);
		people.add(p3);
		Person p4 = new Person("x4", Person.Sex.female, 27, 1.59);
		people.add(p4);
		return people;
	}

}
