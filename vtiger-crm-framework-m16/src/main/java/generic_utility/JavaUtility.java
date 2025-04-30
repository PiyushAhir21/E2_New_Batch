package generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility {
	public int generateRanNum() {
		int random = (int) (Math.random() * 1000);
		return random;
	}

	public String timePicker() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
		String time = now.format(dtf);
		return time;
	}

}
