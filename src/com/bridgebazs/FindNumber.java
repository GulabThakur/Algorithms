package com.bridgebazs;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		System.out.println("Program Started");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of choices");
		int steps; 
		int result = 1,N;
		boolean check;
		N = scanner.nextInt();
		int a=N%2;
		int b=(N/2)-1;
		steps= b-a;
		System.out.println(steps);
		System.out.println("Imagine the no. between 0 to "+(N-1));
		int first = 1;
		int last = N/2;
		int i=2,j=4;
		for(int k=1;k<steps;k++)
		{
			System.out.println("Is Your no Present Between "+(first-1)+" to "+(last-1)+"??\ntrue or false");
			check= scanner.nextBoolean();
			if(check){
				N = N/2;
				last = last-((last-first+1)/2);
			}
			else
			{
				first = first+N/i;
				last = last+N/j;
				System.out.println(last);
				i = i+i;
	            j = j+j;
			}
		}
		System.out.println("Is Your no is "+(first-1)+"?? \ntrue or false");
		check= scanner.nextBoolean();
		if(check)
			System.out.println("Answer is: "+(first-1));
		else
			System.out.println("Answer is: "+(last));
		System.out.println("Program Ended");
	  }
		
	}

