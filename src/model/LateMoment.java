package model;

import java.util.Date;
/**
 * hay
 * @author femkeboelens
 *
 */
public class LateMoment implements Comparable<LateMoment> {
	private Date date;
	private String description;
	private TypeOfLate type;
	private final Student student;
	public LateMoment(Student s, String de, TypeOfLate t, Date da) {
		setDate(da);
		setDescription(de);
		student = s;
		setType(t);
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date d) {
		if(d == null) {
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
	@Override
	public int compareTo(LateMoment o) {
		return date.compareTo(o.getDate());
	}
}
