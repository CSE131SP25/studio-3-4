package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int prime = 2;
		
		System.out.println("Until which number would you like to sieve through?");
		int n = in.nextInt();
		
		boolean [] list = new boolean [n];
		for(int i = 0; i < n; i++) {
			
			list [i] = true;
			
		}

		for(int i = 2; i < list.length; i++) {
			for (int j = i * 2; j < n; j = j + i){
				
				list [j] = false;
				
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			if(list [i] = true) {
				
				
				
			}
		}
		
	}

}
