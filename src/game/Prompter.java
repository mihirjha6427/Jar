package game;

import java.util.Scanner;

public class Prompter {
	private String item;
	private int max;
	private int guess;

	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	Scanner reader = new Scanner(System.in);
	
	public void admin(){
		
		
		do{
			System.out.println("Please Enter the item you wanna store in the jar");
			item = reader.nextLine();
			if(item.isEmpty()){
				System.out.println("You haven't entered anything!Please Try again");
			}
		} while(item.isEmpty());
		
		
		System.out.println("You have chosen "+item);
		do{
			System.out.println("Please Enter the maximum amount of "+item+" that could fit in the jar");
			while (!reader.hasNextInt()) {
	            System.out.println("That's not a number!");
	            System.out.println("Please Enter the maximum amount of "+item+" that could fit in the jar");
	            reader.next(); 
	        }
			max = reader.nextInt();	
			if(max<=0){
				System.out.println("Please Enter a positive number");
			}
		}while(max<=0);
		
		
	}
	
	public int player(){
		
		do{
		System.out.print("Guess"+Game.guessCount+" : ");
		while(!reader.hasNextInt()){
			System.out.println("That's not a number!");
			System.out.print("Guess"+Game.guessCount+" : ");
			reader.next();
		}
		guess = reader.nextInt();
		if(guess<0){
			System.out.println("Please Enter a positive number");
		}
		}while(guess<0);
		return guess;
		
	}

	

}
