package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {
	@Test
	public void shoud_return_1_when_FizzBuzzGame_give_1() {
		//given
		int number = 4;
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		
		//when
		String word = fizzBuzzGame.fizzBuzz(number);
		
		//then
		Assertions.assertEquals("4", word);
	}
}
