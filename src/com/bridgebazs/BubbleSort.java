package com.bridgebazs;
import com.bridgeLabzs.utility.Utility;
import java.util.Scanner;
public class BubbleSort {
		public static void main(String[] args) {
			System.out.println("Program Started");
			Utility utility= new Utility();
			int num;
			int array[] ; 
			Scanner scanner =new Scanner(System.in);
			System.out.println("Please Enter the how many number you want to store");
			num=scanner.nextInt();
			array=new int[num];
			for(int i=0;i<num;i++)
			{
				array[i]=scanner.nextInt();
			}
			// utility.bubble(array);
			for(int j=0;j<num;j++) 
			{
				System.out.println(array[j]);
			}
			System.out.println("Progra Ended");
		}
}
