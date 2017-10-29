package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class InsertionSort {
		public static void main(String[] args) {
			System.out.println("Program Started ");
			Utility utility=new Utility();
			int number;
			Scanner scanner =new Scanner(System.in);
			number=scanner.nextInt();
			int array[]=new int[number];
			for(int i=0;i<number;i++) 
			{
				 array[i]=scanner.nextInt();
			}
			array=utility.insertionSortInt(array);
			for(int j=0;j<number;j++)
			{
				System.out.println(array[j]);
			}
			System.out.println("Program Ended");
		}
}
