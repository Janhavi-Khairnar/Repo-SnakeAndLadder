package com.technospace.snakeandladder;

import java.util.Random;

public class SnakeLadderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Using this variable sets the initial position of a player.
		 */
		int position = 0;
		int position2 = 0;
		int chance = 1;
		int count_rollDie = 0;
		final int NO_PLAY = 1;
		final int LADDER = 2;
		final int SNAKE = 3;
		
		/***
		 * Using Object of Random Class to generate the die number between 1-6.
		 */
		Random random = new Random();
		
		System.out.println("Initial Position of 1st Player :"+position);
		System.out.println("Initial Position of 2nd Player :"+position2);
		
		while(position != 100)
		{	
			if(chance % 2 == 0)  
			{
				System.out.println("Chance of 1st Player!");
				int dieNo = random.nextInt(6)+1;
				System.out.println("Die Number :"+dieNo);
				count_rollDie++;
				
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
							if(position > 100) {
								position  = position - dieNo;
							}
							chance--;
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
					System.out.println("New Position for 1st Player :"+position);
					//System.out.println("#######");
			}
			else {
				System.out.println("Chance of 2nd Player!");
				int dieNo = random.nextInt(6)+1;
				System.out.println("Die Number :"+dieNo);
				count_rollDie++;
				
				int option = random.nextInt(3)+1;
				System.out.println("Option Number :"+option);
				switch(option)
				{
					case NO_PLAY:
							System.out.println("Option = No Play");
							position2 = position2;
						break;
					case LADDER:
							System.out.println("Option = Ladder");
							position2 = position2 + dieNo;
							if(position2 > 100) {
								position2  = position2 - dieNo;
							}
							chance--;
						break;
					case SNAKE:
							System.out.println("Option = Snake");
							position2 = position2 - dieNo;
						if(position2 < 0)
						{
							position2 = 0;
						}
						break;
				}
				
					System.out.println("New Position for 2nd Player :"+position2);
					
			}
			System.out.println("######################");
			chance++;
			System.out.println("Chance :"+chance);
			
		}
			
			System.out.println("How many times roll is die? :"+count_rollDie);
	
	}
}
