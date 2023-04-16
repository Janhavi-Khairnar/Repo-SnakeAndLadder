package com.technospace.snakeandladder;

import java.util.Random;

public class SnakeLadderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Using this variable sets the initial position of a player.
		 */
		int position = 0;
		final int NO_PLAY = 1;
		final int LADDER = 2;
		final int SNAKE = 3;
		
		/***
		 * Using Object of Random Class to generate the die number between 1-6.
		 */
		Random random = new Random();
		
		System.out.println("Initial Position of a Player :"+position);
		
		while(position != 100)
		{	
			int dieNo = random.nextInt(6)+1;
			System.out.println("Die Number :"+dieNo);
			
			int option = random.nextInt(3)+1;
			System.out.println("Option Number :"+option);
			switch(option)
			{
				case NO_PLAY:
						System.out.println("Option = No Play");
						position = position;
					break;
				case LADDER:
						System.out.println("Option = Ladder");
						position = position + dieNo;
					break;
				case SNAKE:
						System.out.println("Option = Snake");
						position = position - dieNo;
					if(position < 0)
					{
						position = 0;
					}
					break;
			}
			
			System.out.println("New Position :"+position);
			System.out.println("#######");
		
	}
	}	

}
