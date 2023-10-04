package Intern;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int maxatt=6;
		int attempt=0;
		int lower=1;
		int upper=100;
		int randnum=r.nextInt(upper-lower+1)+lower;
		System.out.println("WELCOME TO GUESS NUMBER GAME");
		System.out.println("GUESS a Number and WIN the Game");
		System.out.println("you have Maximum"+" "+maxatt+" "+"attempt limit");
		
		while(attempt<maxatt)
		{
			System.out.println("Enter your GuessNumber between"+" "+lower+"to"+upper);
		    int guessnum=sc.nextInt();
		    attempt++;
		    if(guessnum>randnum)
		    {
		    	System.out.println("YOUR GUESS NUMBER IS GREATER");
		    }
		    else if(guessnum<randnum)
		    {
		    	System.out.println("YOUR GUESS NUMBER IS SMALLER");
		    	
		    }
		    else
		    {
		    	System.out.println("OOHHOOOO!YOUR NUMBER IS CORRECT.YOU WIN THE GAME");
		    	break;
		    }
		    if(attempt<maxatt)
		    {
		    	System.out.println("you have"+(maxatt-attempt)+"attempts remaining");
		    }
		    else {
		    	System.out.println("You have reached maximum attempts SORRY YOU CANT CONTINUE!");
		    }
		}
		
	}

}
