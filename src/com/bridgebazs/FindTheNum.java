package com.bridgebazs;

import java.util.Scanner;

public class FindTheNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int steps=sc.nextInt();
		int result=1;
		for(int i=1; i<=steps; i++)
		{
			result=result*2;
		}
		int n=result;
		int l1=0;
		int check;
		System.out.println("Imaging a number.");
		int i=2, j=4, first=1, last=n/2;
		while(l1<=steps)
		{
			System.out.println("Is your number present b/w "+(first-1)+" to "+(last-1)+"\nenter 1 to yes & 2 to no :");
			check=sc.nextInt();
			switch(check)
			{
			case 1:
				n=n/2;
				last=last-((last-first+1)/2);
				l1++;
				break;
				
			case 2:
				first=first+n/i;
				last=last+n/j;
				i=i+i;
				j=j+j;
				l1++;
				break;
				
			default :
				System.out.println("You have entered wrong choise, please enter again");
				break;
			}
		}
		System.out.println("Is your no : "+(first-1)+" To yes 1 : ");
		check=sc.nextInt();
		switch (check) {
		case 1:
			System.out.println("Answer is : "+(first-1));
			break;
			
		default:
			System.out.println("Answer is : "+last);
			break;
		}
}
}
