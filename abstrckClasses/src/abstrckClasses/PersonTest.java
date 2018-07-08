package abstrckClasses;

public class PersonTest {

	public static void main(String[] args) {

		Person[] people = new Person[2];

		people[0] = new Employee("Igor Bats", 10000, 2015, 10, 10);
		people[1] = new Student("Petya Tsupryk", "junior");

		for (Person p : people)
			System.out.println(p.getName() + " , " + p.getDescription());

		Employee alice1 = new Employee("Alice Adama", 75000, 2005, 11, 11);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice Adama", 75000, 2005, 11, 11);
		Employee bob = new Employee("Bob Singler", 50000, 1987, 12, 12);

		System.out.println("alice1 == alice2: " + (alice1 == alice2));

		System.out.println("alice1 == alice3: " + (alice1 == alice3));

		System.out.println("alice1.equals(alice3)" + alice1.equals(alice3));

		System.out.println("alice1.equals(bob)" + alice1.equals(bob));

		System.out.println("bob.toString(): " + bob);

		Manager carl = new Manager("Carl Cracker", 80000, 20000, 7, 7);
		Manager boss = new Manager("Carl Cracker", 80000, 20000, 7, 7);
		boss.setBonus(5000);

		System.out.println("boss.toString(): " + boss);
		System.out.println("carl.equals(boss):" + carl.equals(boss));
		System.out.println("alice1.hushCode(): " + alice1.hashCode());
		System.out.println("alice3.hushCode(): " + alice3.hashCode());
		System.out.println("bob.hushCode(): " + bob.hashCode());
		System.out.println("carl.hushCode(): " + carl.hashCode());
		System.out.println("boss.hushCode(): " + boss.hashCode());
	}
}
