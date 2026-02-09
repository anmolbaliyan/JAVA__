package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestWinner {

	public static void main(String[] args) {

		ArrayList<Contestent> list = new ArrayList<Contestent>();

		list.add(new Contestent("Ram", "7875896985"));
		list.add(new Contestent("Shyam", "6985878589"));
		list.add(new Contestent("Ajay", "6985878589"));
		list.add(new Contestent("Vijay", "7875896985"));
		list.add(new Contestent("Jay", "7875836985"));
		list.add(new Contestent("Pappu", "6585898587"));
		list.add(new Contestent("invalidNo", "78858"));

		// get phoneNo
		list.stream().map(e -> e.phoneno).forEach(System.out::println);

		System.out.println("--------------");

		// get valid phoneNo
		list.stream().map(e -> e.phoneno).filter(e -> e.length() == 10).forEach(System.out::println);
		System.out.println("--------------");

		// remove duplicate phoneNo
		list.stream().map(e -> e.phoneno).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		System.out.println("--------------");

		// shuffle phoneNo
		list.stream().map(e -> e.phoneno).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);
	}

}
