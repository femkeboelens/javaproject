package data;

import model.Student;

import java.util.Collection;
import java.util.HashSet;
/**
 * Deze klasse is om een lijstje met leerlingen op te slaan
 * @author Laptop
 *
 */
public class Students {
	/**
	 * een lijst met leerlingen
	 * Collection<> is een klasse voor het bijhouden van een (ongeordende) lijst
	 */
	private static Collection<Student> students = new HashSet<Student>();
	public static void addStudent(Student s) {
		students.add(s);
	}
	/**
	 * Zoek leerling op voornaam/achternaam hoofdletter ongevoelig
	 * @param voornaam
	 * @param achternaam
	 * @return de gevonden leerling. Of null als er niks is gevonden
	 */
	public static Student search(String voornaam, String achternaam) {
		//ga door alle leeringen
		for(Student s : students) {
			if(voornaam.equalsIgnoreCase(s.getFirstName())//als voornaam hetzelfde is
			&& achternaam.equalsIgnoreCase(s.getLastName())) {//en de achternaam(&& staat voor 'en')
				return s;//geeft dan de huidige leerling
			}
		}
		//als we hier zijn is er geen leerling gevonden
		return null;
	}
	public static void fillDatabase() {
		addStudent(new Student("Onis", "Ramon", ""));
		addStudent(new Student("Vries", "Jantje", "de"));
		addStudent(new Student("Johnson", "Piet", ""));
		addStudent(new Student("Bakker", "Herman", ""));
		addStudent(new Student("Broeken", "Josje", "van der"));
		addStudent(new Student("Hendriksen", "Petra", ""));
	}
}
