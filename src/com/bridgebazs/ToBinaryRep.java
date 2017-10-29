package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;
public class ToBinaryRep<T> {
	
	public static void main(String[] args) {
		System.out.println("Program Started");
		Utility utility=new Utility();
		int num, array[]=new int[32] ;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		num =scanner.nextInt();
		int[] str=utility.toBinary(num);
		array=str;
		for(int i=31;i>=0;i--) 
		{
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("Program Ended");
	}

}
