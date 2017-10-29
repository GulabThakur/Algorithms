package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;
public class Test {
    public static void main(String[] args) {
		System.out.println("Program Started");
		double star=System.currentTimeMillis();
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("please Enter the number of element :");
		int number=scanner.nextInt();
		System.out.println("Please Which data will be store \n1:String \n2:Intger ");
	    Integer array[]=new Integer[number];
		System.out.println("Store the data :");
		for(int i=0;i<number;i++) 
		{
			array[i]=scanner.nextInt();
		}
		String array1[]=new String[number];
		System.out.println("Please Store the String data");
		for(int i=0;i<number;i++) 
		{
			array1[i]=scanner.next();
		}
		System.out.println("For Integer data");
		System.out.println("Pleae Ente you want to search");
		int search=scanner.nextInt(); 
		array=utility.binarySearchInt(array, search);
	    double end=System.currentTimeMillis();
		System.out.println("Time is :"+(end-star));
		utility.print(array, number);
		System.out.println("For String data");
		System.out.println("Pleae Ente you want to search");
		String search1=scanner.next(); 
		array1=utility.binarySearchInt(array1, search1);
		utility.print(array1, number);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		end=System.currentTimeMillis();
		System.out.println("Time is :"+(end-star));
		array=utility.insertionSortString(array);
		utility.print(array, number);
		System.out.println("................................");
		array1=utility.insertionSortString(array1);
		utility.print(array1, number);
		System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<");
		end=System.currentTimeMillis();
		System.out.println("Time is :"+(end-star));
		array=utility.bubbleSortInt(array);
		utility.print(array, number);
		System.out.println("................................");
		array1=utility.bubbleSortInt(array1);
		utility.print(array1, number);
		System.out.println("Program Started");
	}
}
