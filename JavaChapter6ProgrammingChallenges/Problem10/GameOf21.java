import java.util.Scanner;

public class GameOf21 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Die dice = new Die(6);
		
		boolean nextTurn = true;
		String answer;
		int playerTotal = 0;
		int computerTotal = 0;
		
		while(playerTotal <= 21 && nextTurn == true)// AND player agrees to roll the dice.
		{
			System.out.println("Would you like to roll the dice?");
			answer = input.nextLine();
			
			if(answer.equalsIgnoreCase("YES"))
			{
				nextTurn = true;
				playerTotal += dice.roll() + dice.roll();
				computerTotal += dice.roll() + dice.roll();
				System.out.println("Player points: " + playerTotal);
			}
			else if(answer.equalsIgnoreCase("NO"))
			{
				nextTurn = false;
			}
			else
			{
				System.out.println("Invalid input: Would you like to roll the dice?");
			}
		}
		
		if(playerTotal <= 21 && (playerTotal > computerTotal || computerTotal > 21))
		{
			System.out.println("Computer Points: " + computerTotal);
			System.out.println("Player Points: " + playerTotal);
			System.out.println("The player won!");
		}
		else if(computerTotal <=21 && (computerTotal > playerTotal || playerTotal > 21))
		{
			System.out.println("Computer Points: " + computerTotal);
			System.out.println("Player Points: " + playerTotal);
			System.out.println("The computer won!");
		}
		else
		{
			System.out.println("Computer Points: " + computerTotal);
			System.out.println("Player Points: " + playerTotal);
			System.out.println("Nobody won!");
		}
		
	}
}

/* 
• Each round of the game is performed as an iteration of a loop that repeats as long as the player agrees to roll the dice, and the player’s total does not exceed 21.
• At the beginning of each round, the program will ask the user whether or not he or she wants to roll the dice to accumulate points.
• During each round, the program simulates the rolling of two six-sided dice. It rolls the dice first for the computer, and then it asks the user whether he or she wants to roll. (Use the Die class that was shown in Code Listing 6-14 to simulate the dice.)
• The loop keeps a running total of both the computer’s and the user’s points.
• The computer’s total should remain hidden until the loop has finished.
• After the loop has finished, the computer’s total is revealed, and the player with the
most points, without going over 21, wins.
*/