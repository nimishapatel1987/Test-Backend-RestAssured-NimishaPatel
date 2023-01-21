package com.virgingames.utils;

import java.util.Random;
//It consists of different reusable framework methods to perform different operation

public class TestUtils {

	public static String getRandomValue(){
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}
}
