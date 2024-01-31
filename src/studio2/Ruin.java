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

		
		for (int totalSimulations = 0; totalSimulations < 500; totalSimulations++){	
		int count = 0;
		int Wins = 0;
		int Losses = 0;
		while ((startAmount > 0) && (startAmount != winLimit)) {
			double result = Math.random();
			if (result <= winChance){
				startAmount++;
			}
			else if (result > winChance) {
				startAmount = startAmount - 1;
			}
			count++;
			int Wins = 0;
			if (startAmount == winLimit){
				Wins++;
			}
			int Losses = 0;
			if (startAmount == 0) {
				Losses++;
			}
		}
		if (startAmount == winLimit) {
		System.out.println("Simulation " + totalSimulations + ":" + count + "WIN");
		}
		if (startAmount == 0) {
		System.out.println("Simulation " + totalSimulations + ":" + count + "LOSS");
		}
		System.out.println("Losses: " + Losses + " ");
		System.out.print("Simulations: " + totalSimulations);
		
		}
		
		

	}

}
