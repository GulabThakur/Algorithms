package com.bridgebazs;



import java.util.Scanner;
class PrimeNumber
{
	public static void main(String [] arg)
	{
	  System.out.println("Program Started");
	  Scanner sc =new Scanner(System.in);
	  PrimeNumber pm=new PrimeNumber();
	  int count=0;int sum=0;
      boolean status; 
	  System.out.println("Please enter the start number :");
      int num1=sc.nextInt();
	  int num; 
	  System.out.println("Please enter the last number :");
	  int n=sc.nextInt();
	   for(num =2;num<=n;num++)
		{
		  status=pm.primeNum(num);
		  if(status)
		  {
		    System.out.print(num+" ");
		    count++;
    		  }
		}
	  System.out.println();
	  System.out.println("Program Ended");  	
	}
	boolean primeNum(int num)
	{
	  for(int i=2;i<num;i++)
		{
		   if(num%i==0)
			{
			  return false;
			}
		
		}
	return true;
	} 
}
