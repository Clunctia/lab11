package student;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Comparator;

/**
 * Display reminders of students having a birthday soon.
 * @author you
 */
public class StudentApp {

	/**
	 * Print the names (and birthdays) of students having a birtday in the
	 * specified month.
	 * @param students list of students
	 * @param month the month to use in selecting bithdays
	 */
	public void filterAndPrint( List<Student> students, Predicate<Student> filter, Consumer<Student> action, Comparator<Student> byName, Comparator<Student> byBirthday ) {
		students.stream().filter( filter ).sorted( byBirthday ).forEach(action);
	}

	public static void main(String[] args) {
		List<Student> students = Registrar.getInstance().getStudents();
		Comparator<Student> byName = (a, b) -> a.toString().compareTo(b.toString());
		Comparator<Student> byBirthday = (a, b) -> (a.getBirthdate().getDayOfYear() - b.getBirthdate().getDayOfYear());
		
		Predicate<Student> checkBirthDate = (s) -> s.getBirthdate().getMonthValue() == LocalDate.now().getMonthValue();
		Consumer<Student> action = (s) -> System.out.printf("%s has birthday on %d %s\n", s, s.getBirthdate().getDayOfMonth(), s.getBirthdate().getMonth());
		StudentApp app = new StudentApp();
		app.filterAndPrint(students, checkBirthDate, action, byName, byBirthday );
	}


}
