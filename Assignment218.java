package TestNGCLAssignments;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

//WAP to utilize remove, replace, putifabsent in Map Interface?

public class Assignment218 {

	@Test
	public void MapInterface_Functions() {

		Map m1 = new HashMap();

		m1.put("Name", "Abhilash");
		m1.put("Name1", "Kalyan");
		m1.put("Name2", "Ramesh");

		System.out.println(m1);

		m1.remove("Name2", "Ramesh"); // -----> REMOVE METHOD
		System.out.println(m1);

		m1.replace("Name1", "Pavan"); // Replace Method
		System.out.println(m1);

		m1.putIfAbsent("Name4", "Kiran"); // PutIF absent method
		System.out.println(m1);

	}

}
