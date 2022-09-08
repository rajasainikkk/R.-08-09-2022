package com.decision.bll;

public class DigitsCount {
	
	public int DigitsCount(int n){
		
		int count=0;
		
		while(n!=0) {
			
			n = n /10;
			
			count++;
		}
	return count;
	}


}
