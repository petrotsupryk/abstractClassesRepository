package abstrckClasses;

public class PersonTest {

	public static void main(String[] args) {

		Person[] people = new Person[2];

		people[0] = new Employee("Igor Bats", 10000, 2015, 10, 10);
		people[1] = new Student("Petya Tsupryk", "junior");

		for (Person p : people)
			System.out.println(p.getName() + " , " + p.getDescription());
	}

}
