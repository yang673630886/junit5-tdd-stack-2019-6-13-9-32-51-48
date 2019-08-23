package com.thoughtworks.tdd;

public class FizzBuzzGame {

	public String fizzBuzz(int i) {
		// TODO Auto-generated method stub
		if (i % 3 == 0) {
			if (i % 5 == 0) {
				if (i % 7 == 0) {
					return "FizzBuzzWhizz";
				}
				return "FizzBuzz";
			}
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";

		} else if (i % 7 == 0) {
			return "Whizz";
		} else {
			return String.valueOf(i);
		}
	}
}
