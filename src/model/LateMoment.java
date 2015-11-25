package model;

import java.util.Calendar;
/**
 * Deze class is voor te-laat-momentjes.
 * @author femkeboelens
 *
 */
								   // we implementeren hier comparable(een interface)
								   // met comparable kunnen we een lijst met te-laat-momentjes op een
								   // speciale manier sorteren
public class LateMoment implements Comparable<LateMoment> {
	private Calendar date;//hierin staat de datum/tijd
	private String description;//Hierin kun je bijzonderheden van het te-laat-momentje in zetten. 
	private TypeOfLate type;//hierin kun je een type aangeven.
	private final Student student;//het belangrijkste: de leerling waar het om gaat
	/**
	 * Maak een nieuw te-late-momentje aan.
	 * Dit moet gebeuren wanneer de leerling (te laat) aankomt
	 * @param s de leerling
	 * @param de bijzonderheden
	 * @param t type(geoorloofd of ongeoorloofd)
	 * @param da datum/tijd
	 */
	public LateMoment(Student s, String de, TypeOfLate t, Calendar da) {
		setDate(da);
		setDescription(de);
		student = s;
		setType(t);
	}
	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Calendar d) {
		if(d == null) {//controlleer of we wel een geldige datum hebben
			return;
		}
		date = d;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the type
	 */
	public TypeOfLate getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(TypeOfLate type) {
		this.type = type;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	// om comparable te laten werken moeten we de volgende method implementeren
	// in compareTo gaan we het huidige object waar we in zitten vergelijken met een gegeven object
	// het gegeven object heet in dit geval o
	@Override
	public int compareTo(LateMoment o) {
		// we willen sorteren op datum. Dus vergelijken we de datums met elkaar
		return date.compareTo(o.getDate());
	}
}
