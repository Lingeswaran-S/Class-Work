package com.te.learn.comparatorpractise;

import java.util.Comparator;

public class CompareBasedOnSalary implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if (e1.getSalaray() > e2.getSalaray())
			return 1;
		else if (e1.getSalaray() < e2.getSalaray())
			return -1;

		return 0;
	}

}
