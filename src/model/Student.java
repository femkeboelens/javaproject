package model;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import util.Util;
/**
 * Een class om een leerling in te stoppen :D
 * @author Laptop
 *
 */
public class Student {
	private String lastName;//achternaam
	private String firstName;//voornaam
	private String prefix;//tussenvoegsel
	private Date dateOfBirth;//geboortedatum
	private Gender gender;//geslacht
	/**
	 * we gebruiken TreeSet omdat deze de lijst automatisch sorteert
	 * dit is de reden waarom we Comparable in LateMoment implementeren.
	 * als we dit niet hadden gedaan wist de TreeSet niet hoe hij deze moest sorteren
	 */
	private TreeSet<LateMoment> lateMoments = new TreeSet<LateMoment>();//een GESORTEERDE lijst met te-laat-momentjes
	/**
	 * Maak een nieuwe leerling aan
	 * @param ln achternaam
	 * @param fn voornaam
	 * @param pf tussenvoegsel
	 */
	public Student(String ln, String fn, String pf) {
		lastName = ln;
		firstName = fn;
		prefix = pf;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * @return the lateMoments
	 */
	public TreeSet<LateMoment> getLateMoments() {
		return lateMoments;
	}
	public Set<LateMoment> getUnalowedLateMoments() {
		Set<LateMoment> result = new HashSet<LateMoment>();
		for(LateMoment lm : lateMoments) {
			if(lm.getType() == TypeOfLate.UNALOWED) {
				result.add(lm);
			}
		}
		return result;
	}
	private void addLateMoment(LateMoment lm) {
		if(lm.getStudent() != this) {
			return;
		}
		lateMoments.add(lm);
	}
	public void addLateMoment(String description, TypeOfLate type) {
		if(Util.compareDate(Calendar.getInstance(), 8, 15)) {
			return;
		}
		addLateMoment(new LateMoment(this, description, type, Calendar.getInstance()));
		if(getUnalowedLateMoments().size() == 5) {
			JOptionPane.showMessageDialog(null, "Deze leerling moet dringend gestraft worden!");
		}
	}
}
