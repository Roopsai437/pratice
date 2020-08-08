package org.dxctraining;

import java.util.*;

public class StudentMain {

	private Map<String, Student> a = new HashMap<>();

	public static void main(String[] args) {
		StudentMain run = new StudentMain();
		run.runApp();
	}

	public void runApp() {
		a.put("a1", (new Student("a1", 22, "sai")));
		a.put("b2", (new Student("b2", 25, "gopi")));
		a.put("c3", (new Student("c3", 20, "sippi")));
		a.put("d4", (new Student("d4", 27, "subash")));
		app();
	}

	public void app() {
		Set<String> keys = a.keySet();
		for (String k : keys) {
			Student s = a.get(k);

			List<String> r = new ArrayList();
			r.add(s.getRollNo());

			if (s.getAge() % 2 == 0) {
				List<Student> le = new ArrayList();
				le.add(a.get(k));

			} else {
				List<Student> lo = new ArrayList();
				lo.add(a.get(k));
			}

		}

	}

}
