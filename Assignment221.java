package TestNGCLAssignments;

import java.util.Date;

import org.testng.annotations.Test;

//WAP to utilize Date & Time Concept?

public class Assignment221 {

	@Test
	public void Date_Time() {

		Date d1 = new Date();

		// System.out.println(d1.getTime());

		Date d2 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 3));
		System.out.println(d2);

		String FutherTime = d2.toString();
		System.out.println(FutherTime);

		String Year = FutherTime.substring(FutherTime.length() - 4);

		System.out.println(Year); // only year will be displayed

		String month = FutherTime.substring(4, 7); // only month will be displayed

		System.out.println(month);

		String time = FutherTime.substring(10, 18); // only time will be displayed

		System.out.println(time);

		String StringFormat = time.concat(month).concat(Year);

		System.out.println(StringFormat);

	}

}
