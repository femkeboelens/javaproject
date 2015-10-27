package util;

import java.util.Date;

public class Util {
	/**
	 * Compares date with hour/minute
	 * @param d
	 * @param hour
	 * @param min
	 * @return true als op tijd en anders false
	 */
	public static boolean compareDate(Date d, int hour, int min) {
		return d.getHours() < hour || d.getMinutes() <= min;
	}
}
