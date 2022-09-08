package com.decision.bll;
import java.util.Scanner;
public class LaptopP {
	
	private static final int password=8899;
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int i;
		for(i=1; i<4; i++)
		{
			System.out.println("Enter a four digit password");
			int p=input.nextInt();
			if(password==p)
			{
				System.out.println("Correct, welcome back ");
				break;
			}
			else
			{
				if(i==3)break;
				System.out.println("Incorrect, try again");
			}
		}
		if(i==3){
			System.out.println("Sorry but you have been locked out");
		}
		
	}
	

}


