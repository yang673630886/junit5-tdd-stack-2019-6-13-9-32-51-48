package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {
	@Test
	public void shoud_return_1_when_FizzBuzzGame_give_1() {
		// given
		int number = 4;
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		// when
		String word = fizzBuzzGame.fizzBuzz(number);

		// then
		Assertions.assertEquals("4", word);
	}

	@Test
	public void shoud_return_fizz_when_FizzBuzzGame_give_3() {
		// given
		int number = 3;
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		// when
		String word = fizzBuzzGame.fizzBuzz(number);
		// then

		Assertions.assertEquals("Fizz", word);
	}

	@Test
	public void shoud_return_buzz_when_FizzBuzzGame_give_5() {
		// given
		int number = 5;
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		// when
		String word = fizzBuzzGame.fizzBuzz(number);
		// then

		Assertions.assertEquals("Buzz", word);
	}

	@Test
	public void shoud_return_Whizz_when_FizzBuzzGame_give_7() {
		// given
		int number = 7;
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		// when
		String word = fizzBuzzGame.fizzBuzz(number);
		// then

		Assertions.assertEquals("Whizz", word);
	}

	@Test
	public void shoud_return_fizz_when_FizzBuzzGame_give_105() {
		// given
		int number = 105;
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		// when
		String word = fizzBuzzGame.fizzBuzz(number);
		// then

		Assertions.assertEquals("FizzBuzzWhizz", word);
	}

	@Test
	public void shoud_return_FizzBuzz_when_FizzBuzzGame_give_15() {
		// given
		int number = 15;
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		// when
		String word = fizzBuzzGame.fizzBuzz(number);
		// then

		Assertions.assertEquals("FizzBuzz", word);
	}
}
