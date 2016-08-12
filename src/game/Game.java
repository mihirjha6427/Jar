package game;


import java.util.Random;


public class Game {
	private static boolean validInt(int integer){
		boolean bool= true;
		if(integer<0){
			bool=false;
		}
		return bool;
	}

	public static int guessCount=0;
	public static final int MAX_ATTEMPT = 7;
	public static void main(String[] args){
		
		Prompter prompter = new Prompter();
		System.out.println("Administrative setup");
		System.out.println("=====================");
		prompter.admin();
		Jar jar = new Jar(prompter.getItem(),prompter.getMax());
		
		
		Random random = new Random();
		int someNumber = random.nextInt(jar.getMax());
		
		System.out.println("Player setup");
		System.out.println("=============");
		
		guessCount++;
		System.out.println("Guess how many "+jar.getItem()+" in the jar");
		int guess =prompter.player();
		if(!validInt(guess)){
			System.out.println("Please Enter a  Postive Integer");
		}
		while(guessCount<MAX_ATTEMPT){
			if(guess== someNumber){
				
				System.out.println("Congratulations you have got it in "+ (guessCount) +" attempt/s!!");
				System.exit(0);
				
				
			}
			else{
				
				System.out.println("Sorry wrong guess . you are left with "+ (MAX_ATTEMPT-guessCount)+" guesses. Please try again");
				if (guess-someNumber>0){
					System.out.println("Your are guessing higher");
				}
				else 
					System.out.println("Your are guessing lower");
				System.out.println();
				guessCount++;
				guess =prompter.player();
				
				
				
			}
			
			if (guessCount==MAX_ATTEMPT){
				System.out.println("Sorry you loose :(");
			}
		}
		
		
	}

}
