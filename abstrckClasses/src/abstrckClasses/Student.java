package abstrckClasses;

public class Student extends Person {

	private String major;
	private String name;

	/**
	 * @param name
	 *            імя студента
	 * @param major
	 *            спеціальність студента
	 */
	public Student(String name, String major) {
		super(name);
		this.name=name;
		this.major = major;
	}

	public String getDescription() {

		return "a student majoring in " + major;
	}
	
	public String getName() {
		return name;
	}
}
