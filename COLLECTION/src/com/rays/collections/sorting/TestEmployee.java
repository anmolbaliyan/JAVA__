package com.rays.collections.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ram", 10000);
		Employee e2 = new Employee(2, "Ram", 56874);
		Employee e3 = new Employee(3, "Ram", 45000);
		Employee e4 = new Employee(4, "Ram", 68388);
		Employee e5 = new Employee(5, "Ram", 86489);
		Employee e6 = new Employee(6, "Ram", 72789);

		ArrayList list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		System.out.println(list);

		System.out.println("----------");

		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println("-----------");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
