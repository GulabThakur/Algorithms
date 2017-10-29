package com.bridgebazs;

import java.util.Scanner;

public class ImaginNum {
	    public static void main(String[] args) {
			System.out.println("Program Started");
			System.out.println("Please enter the number :");
			Scanner scanner =new Scanner(System.in);
			int N=scanner.nextInt();
			boolean arg;
			boolean status;
			int start=0;
			int end=N-1;
			int mid=(start+end)/2;
			System.out.println("Image choice Between "+start+" to "+end);
			
			while(start!=mid) 
			{
				System.out.println("Your number Between "+start+" to "+mid);
				arg=scanner.nextBoolean();
				status=ImaginNum.imaging(arg);
				if(status) 
				{
					end=mid;
					mid=mid-1;
					
				}
				else 
				{
					start=mid+1;
					mid=(start+end)/2;
				}
			}
			System.out.println("your Number is :"+start);
			arg=scanner.nextBoolean();
			if(arg==false)
			{
				System.out.println("Your Number is "+mid+1);
			}
			System.out.println("Program Ended");
		}
	    public static boolean imaging(boolean arg) 
	    {
	    	return arg;
	    }

}
