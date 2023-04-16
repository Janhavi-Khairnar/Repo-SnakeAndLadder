package com.technospace.snakeandladder;

import java.util.Random;

public class SnakeLadderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***
		 * Using Object of Random Class to generate the die number between 1-6.
		 */
		Random random = new Random();
		
		/***
		 * Using this variable sets the initial position of a player.
		 */
		int position = 0;
		System.out.println("Initial Position of a Player :"+position);
		
		
		int dieNo = random.nextInt(6)+1;
		System.out.println("Die Number :"+dieNo);
		
		position = position + dieNo;
		System.out.println("New Position after Rolling the Die :"+position);
		
	}

}
