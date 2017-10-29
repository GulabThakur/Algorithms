package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class Anagram {
    public static void main(String[] args) {
		System.out.println("Program Started");
		Utility un =new Utility();
		boolean status=false;
		Scanner scanner =new Scanner(System.in);
		String str1,str2;
		System.out.println("Please Enter the String :");
		str1=scanner.nextLine();
		System.out.println("Please Enter the String :");
		str2=scanner.nextLine();
		status=un.iAnagram(str1, str2);
		if(status)
		{
			System.out.println("This string "+str1+" and "+str2+" is anagram");
		}
		else 
		{
			System.out.println("This string "+str1+" and "+str2+" is not anagram");
		}
		System.out.println("Program Ended ");
	}
}
