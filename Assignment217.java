package TestNGCLAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

//WAP to store String & Character using Map Interface & also use iterator?

public class Assignment217 {

	@Test
	public void MapInterface() {

		Map m1 = new HashMap(); // string values

		m1.put("Name", "Abhilash");
		m1.put("Course", "Automation Tester");

		System.out.println(m1);

		Map<String, Integer> m2 = new HashMap(); // String Name and integer values

		m2.put("Abhilash", 309);
		m2.put("Pavan", 312);

		System.out.println(m2);

		m1.putAll(m2); // to insert all the elements from m2 to m1

		System.out.println(m1);

		for (String s2 : m2.keySet()) // it will give the keys
		{
			System.out.println(s2);
		}

		for (Integer s3 : m2.values()) // it will return the values
		{
			System.out.println(s3);
		}

		for (Entry<String, Integer> s4 : m2.entrySet()) // it calls entire set
		{
			System.out.println(s4);
		}

	}

}
