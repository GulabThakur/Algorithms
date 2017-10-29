package com.bridgebazs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;
class PrimeNuberAndPallindrom
{
	public static void main(String [] arg)
	{
	  System.out.println("Program Started");
	  Scanner sc =new Scanner(System.in);
	  PrimeNuberAndPallindrom pm=new PrimeNuberAndPallindrom();
	  int count=0;int sum=0;
      boolean status,status1,status2; 
      Utility utility=new Utility();
	  System.out.println("Please enter the start number :");
      int num1=sc.nextInt();
	  int num; 
	  System.out.println("Please enter the last number :");
	  int n=sc.nextInt();
	  System.out.println("Prime number between "+num1+" and "+n);
	  for(int i=2;i<=n;i++) 
	  {
		  status=utility.primeNum(i);
		  if(status) 
		  {
			  System.out.print(i+" ");
		  }
	  }
	  System.out.println("palindrom number between :"+num1+" and "+n);
	   for(num =2;num<=n;num++)
		{
		  status=utility.primeNum(num);
		  
		  if(status)
		  {
             status1=utility.pallindrom(num);
		    if(status1)
		     {
			  System.out.print(num+" ");
   		     }
		  }
		 }
	   System.out.println();
	   System.out.println("Anagram number between :"+num1+" and "+n);
	  for(int i=2;i<n;i++) 
	  {
		  for(int j=i+1;j<num-1;j++) 
		  {
			  status2=utility.anagramNum(i, j);
			  status1=utility.primeNum(i);
			  status=utility.primeNum(j);
			  if(status2&&status&&status1) 
			  {
				  System.out.print(i+" :"+j+" ");
			  }
		  }
	  }
	  System.out.println();
	  System.out.println("Program Ended");  	
	}
	
}
