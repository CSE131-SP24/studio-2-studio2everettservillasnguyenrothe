package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win probability for this game?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit today?");
		double winLimit = in.nextDouble();
		int count = 0;
		
		while ((startAmount > 0) && (startAmount != winLimit)) {
			double result = Math.random();
			System.out.println("Current balance: " + startAmount);
			if (result <= winChance){
				startAmount++;
				System.out.println("WIN");
			}
			else if (result > winChance) {
				startAmount = startAmount - 1;
				System.out.println("LOSS");
			}
			count++;
			int Wins = 0;
			if (startAmount == winLimit){
				Wins++;
				System.out.println("Win for the day!");
			}
			int Losses = 0;
			if (startAmount == 0) {
				Losses++;
				System.out.println("Ruin for the day!");
			}
			
		}
		
		System.out.println("Plays: " + count);
		

	}

}
