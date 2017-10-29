package com.bridgebazs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class BinarySearch {
	public static void main(String[] args){
		System.out.println("Program Strated ");
		Utility un=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the you want to search");
		String search = null;
		try {
			search = scanner.next();
		} catch (Exception e) {
		
			e.printStackTrace();
			System.out.println("");
		}
		un.binarySearchWord(search);
		System.out.println("Program Ended");
	}

}
