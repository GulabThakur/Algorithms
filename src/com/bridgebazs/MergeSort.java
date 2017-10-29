package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;
public class MergeSort {
	public static void main(String[] args) {
		System.out.println("Program Started");
		Utility utility=new Utility();
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the how many store value");
		num=scanner.nextInt();
		int array[] =new int [num];
		System.out.println("Please Enter the element ");
		for(int i=0;i<num;i++) 
		{
			array[i]=scanner.nextInt();
		}
		utility.mergeSort(array, 0, num);
		for(int i=0;i<num;i++) 
		{
			System.out.println(array[i]);
		}
		System.out.println("Program Ended");
	}
}
