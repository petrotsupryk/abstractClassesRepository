package abstrckClasses;

import java.time.*;
import java.util.Objects;

public class Employee extends Person {

	private double salary;
	private LocalDate hireDay;
	private String name;

	public Employee(String name, double salary, int year, int month, int day) {

		super(name);
		this.name=name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public boolean equals(Object otherObject) {
		// швидко провірити обєкти на ідентичність
		if (this == otherObject)
			return true;

		// якщо явний параметр має значення null, повертаємо false
		if (otherObject == null)
			return false;

		// якщо класи не співпадають, вони не рівні
		if (getClass() != otherObject.getClass())
			return false;

		// тепер ми знаємо, що otherObject - не пустий обєкт типу Employee
		Employee other = (Employee) otherObject;

		// перевіримо, чи містять поля однакові значення
		return Objects.equals(other, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
	}

	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}

	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}
}
