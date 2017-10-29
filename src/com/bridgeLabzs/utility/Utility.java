package com.bridgeLabzs.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	
	   
		
		/**
		 * @param array
		 * @return
		 * this method using for store a value increasing order
		 */
		public <T extends Comparable<T>> T[] bubbleSortInt(T[] array){
			for(int i=1;i<array.length;i++){
				for(int j=0;j<array.length-i;j++){
					if(array[j].compareTo(array[j+1])>0){
						T temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
			return array;
		
		}
	   /**
	 * @param arr
	 * @return
	 * bubble 
	 */
	public void bubble(int[] arr) 
	   {
		    for(int i=0;i<arr.length;i++) 
		    {
		    	for(int j=1;j<arr.length-1;j++) 
		    	{
		    		if(arr[j-1]>arr[j]) 
		    		{
		    			int tem=arr[j-1];
		    			arr[j-1]=arr[j];
		    			arr[j]=tem;
		    			
		    		}
		    	}
		    }
		
	   } 
		
		/**
		 * @param array
		 * @return
		 * this method using for store the value in increasing order
		 */
		public int[] insertionSortInt(int[] array){
			for(int i=1;i<array.length;i++){
				for(int j=i;j>0;j--){
					if(array[j-1]>array[j]){
						int temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}
			}
			return array;
		}

		
		public <T extends Comparable<T>> T[] insertionSortString(T[] array){
			for(int i=1;i<array.length;i++){
				for(int j=i;j>0;j--){
					if((array[j-1]).compareTo(array[j])>0){
						T temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}
			}
			return array;
		}

		
		/**
		 * @param array
		 * @param num
		 * using binary search for search value in store data and found or not 
		 * found in given store
		 * @return 
		 */
		public <T extends Comparable<T>> T[] binarySearchInt(T[] array, T num){
			int size = array.length;
			
			int start,end,mid,count=0;
			
			start = 0;
			end  = size-1;

			while(start <= end){
				mid = (start+end)/2;
				if (num.compareTo(array[mid])==0){
					System.out.println("Search found at position :"+(mid+1));
					count++;
					break;
				}
				if(num.compareTo(array[mid])<0)
					end = mid-1;
				else
					start = mid+1;		
			}
			if(count == 0)
				System.out.println("Search not found");
			return array;	

		}
		public <T>void print(T[] array ,int number)
		{
			for(int j=0;j<number;j++) 
			{
				System.out.println(array[j]+" ");
			}
		}
		
		/**
		 * @param celcious
		 * this method use for convert celcisus to f
		 */
		public void temperaturConversion(int celcious)
		{
			celcious=(celcious*9)/5+32;
			System.out.println("Tempreture is :"+celcious+"°F");
		} 
		/**
		 * @param ferenite
		 * feranite to celscious
		 */
		public void temperaturConversionToCelcios(int ferenite)
		{
			ferenite=((ferenite-32)*5)/9;
			System.out.println("Tempreture is :"+ferenite+"°C");
		} 
		/**
		 * @param year
		 * @param principal
		 * @param rate
		 * calculate intrest of monthly
		 */
		public void monthlyPayment(double year,double principal, double rate )
		{
			double payment =0;
			double l=100*12;
			double n=12*year;
			payment=principal*(Math.pow((1+(rate/l)), n))-principal;
			System.out.println("Monthly Amount is :"+payment);
		}
		/**
		 * @param c
		 * for sqrure the value
		 */
		public void sqrt(double c) 
		{   
			int t1=(int) Math.sqrt(c);
			System.out.println(t1);
			double t=c;
		    double epsilon=1e-15;
			while(Math.abs(c)>epsilon*t) 
			{
				t=Math.sqrt(c);
			}
			System.out.println(c+"Squre of Number is :"+t);
		}
		/**
		 * @param num
		 * conver the binary number
		 */
		public int[] toBinary(int num) 
		{
			int array[] =new int[32];
			int index=0;
			
			while(num!=0) 
			{
				array[index++]=num%2;
				num=num/2;
				
			}
			
			for(int i=index-1;i>=0;i--) 
			{
				System.out.print(array[i]);
			}
			
			System.out.println();
			return array;
			
		}
		/**
		 * @param arr
		 * @param low
		 * @param high
		 * @return
		 * this method use for sorting
		 */
		public void mergeSort(int [] arr,int low ,int high)
		{ 
			int N=high-low;
			if(N<=1) 
			{
				return;
			}
			int mid =low+N/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid, high);
			int tem[] =new int[N];
			int i=low,j=mid;
			for(int k=0;k<N;k++) 
			{
	            if (i == mid)  

	                tem[k] = arr[j++];

	            else if (j == high) 

	                tem[k] = arr[i++];

	            else if (arr[j]<arr[i]) 

	                tem[k] = arr[j++];

	            else 

	                tem[k] = arr[i++];
			}
			for(int k=0;k<N;k++) 
			{
				arr[low + k] = tem[k];   
			}
		}
		/**
		 * @param day
		 * @param month
		 * @param year
		 * this method is using for find the day of week
		 */
		public void dayOfWeek(int day,int month,int year) 
		{
			 int m,x,d,y;
			 y=year-(14-month)/12;
			 x=y+y/4-y/100+y/400;
			 m = month + 12 *((14-month)/12)-2;
			 d = (day+ x + (31*m) / 12)%7;
			 switch(d)
			 {
			 case 0:
			 {
				 System.out.println("O");
				 System.out.println(day+" /"+month+" /"+year+" /"+"sunday");
				 break;
			 }
			 case 1:{
				 System.out.println("1");
				 System.out.println(day+" /"+month+" /"+year+" /"+"monday");
				 break;
			 }
			 case 2:{
				 System.out.println("2");
				 System.out.println(day+" /"+month+" /"+year+" /"+"tuesday");
				 break;
			 }
			 case 3:{
				 System.out.println("3");
				 System.out.println(day+" /"+month+" /"+year+" /"+"wensday");
				 break;
			 }
			 case 4:{
				 System.out.println("4");
				 System.out.println(day+" /"+month+" /"+year+" /"+"thursday");
				 break;
			 }
			 case 5:{
				 System.out.println("5");
				 System.out.println(day+" /"+month+" /"+year+" /"+"friday");
				 break;
			 }
			 case 6:{
				 System.out.println("6");
				 System.out.println(day+" /"+month+" /"+year+" /"+"saturday");
				 break;
			 }
			 }

		}
		/**
		 * @param num
		 * for using Nibble problem take as input Intger
		 */
		public void toBinaryUsingString(int num) 
		{
			int tem=num;
			String str="";
			while (num!=0)
			{
				int rem = num %2;
				str = rem + str;
				num = num/2;
			}
			System.out.println("Convert :"+tem+"Binary Number :"+str);
			while(str.length()!=8)
			{
				str ="0"+str;
			}
			char[] a=str.toCharArray();
			
			int n=a.length;
		   for(int i=0;i<n/2;i++) 
		   {
			  
				    char temp=a[i];
				    a[i]=a[i+4];
				    a[i+4]=temp;
			   
		   }
		   System.out.print("Swap Nibble form: ");
		   System.out.print(a);
		   System.out.println();
		   double sum1=0,sum=0;
		   int j=0;
		   for(int i=n-1;i>=0;i--) 
		   {
			   if((a[i]=='1')) 
				  {
				   sum=Math.pow(2, j);
				  // System.out.println(sum);
				   sum1=sum1+sum;
				
				  }
			   j++;
			   
		  }
		   System.out.println("Decimal Number is :"+(int)(sum1));
		}
		/**
		 * @param search
		 */
		public void binarySearchWord(String search) 
		{
			int size,start,end,mid,count = 0;
			 String[] wordsArray=null;
			 try{
			 //To read the text file
			 BufferedReader buf=new BufferedReader(new
			FileReader("/home/brideit/conten.text"));
			 String lineFetched = null;
			 //To each line from the text file
			 while(true){
			 lineFetched = buf.readLine();
			 if(lineFetched == null){
			 break;
			 }
			 //split each line based on the " "(space) and storing these in the string array.
			 else{
			 wordsArray = lineFetched.split(" ");
			 }
			 }
			 //once the reading each lines from the file is done,closing the
			
			  buf.close();
			 }
		    catch(Exception e){
			 e.printStackTrace();
			 }
			 //Sorting each words in the string array in the ascending order.
			 for(int i=1;i<wordsArray.length;i++){
			 for(int j=i;j>0;j--){
			 if(wordsArray[j-1].compareTo(wordsArray[j])>0){
			 String temp = wordsArray[j];
			 wordsArray[j] = wordsArray[j-1];
			 wordsArray[j-1] = temp;
			 }
			 }
			 }
			 //To display all the sorted words present in the string array.
			 System.out.println("The sorted elements are;");
			 for(int i=0;i<wordsArray.length;i++){
			 System.out.println(wordsArray[i]);
			 }
			 start = 0;
			 end = wordsArray.length-1;
			 //To search the given word in the array,using binary search.
			 while(start <= end){
			 mid = (start+end)/2;
			 if (search.compareTo(wordsArray[mid])==0){
			 System.out.println("Search found at position :"+(mid+1));
			 count++;
			 break;
			 }
			 if(search.compareTo(wordsArray[mid])<0)
			 end = mid-1;
			 else
			 start = mid+1;
			 }
			 if(count == 0)
			 System.out.println("\nSearch not found");
			 
		}
		/**
		 * @param value
		 */
		public void vendingMachine(int value)
		{
			  int count=0;
		if(value>0)
		{
		  while(value>=1000)
			{  
			count ++;
	              value=value-1000;
	              System.out.print("1000 ");
			}
		  while(value>=500)
			{
			 count++;
			 value =value-500;
			 System.out.print("500 ");
			}
	         while(value>=100)
			{
			 count++;
			 value=value-100;
			 System.out.print("100 ");
			}
		  while(value>=50)
			{
			 count++;
			 value=value-50;
			 System.out.print("50 ");
			}
		 while(value>=10)
			{  
			count ++;
	              value=value-10;
	              System.out.print("10 ");
			}
		while(value>=5)
			{  
			count ++;
	              value=value-5;
	              System.out.print("5 ");
			}
		while(value>=2)
			{  
			      count ++;
	              value=value-2;
	              System.out.print("2 ");
			}
		while(value>=1)
			{  
			      count ++;
	              value=value-1;
	              System.out.print("1 ");
			}
		}
		else
		{
		 System.out.println("Please input right amount :"+count);
		}
		System.out.println();
	  if(count>0)
		{
		  System.out.println("Number of note :"+count);
		}
	 
		}
		/**
		 * @param str1
		 * @param str2
		 */
		 public static boolean iAnagram(String str1, String str2){
		        char[] charFromWord = str1.toCharArray();
		        char[] charFromAnagram = str2.toCharArray();       
		        Arrays.sort(charFromWord);
		        Arrays.sort(charFromAnagram);
		       
		        return Arrays.equals(charFromWord, charFromAnagram);
		    }
		 /**
		 * @param num
		 * @return
		 */
		public boolean primeNum(int num)
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
			/**
			 * @param num
			 * @return
			 */
	  public boolean pallindrom(int num)
		       {
		         long reverse = 0;
		         long n = num;
		         while (n != 0)
		        {
		             reverse *= 10;
		            reverse = reverse + n % 10;
		            n /= 10;
		         }
			if(reverse==num)
		         {
		         	return true;
		         }  
		         else
		         {
		             return false;
		         }
		       }
			/**
			 * @param num
			 * @param num1
			 * @return
			 */
	public boolean anagramNum(int num,int num1) 
			{
				String str1="";
				String str2="";
				str1=String.valueOf(num);
				str2=String.valueOf(num1);
				char[] charFromWord = str1.toCharArray();
			    char[] charFromAnagram = str2.toCharArray();       
			    Arrays.sort(charFromWord);
			    Arrays.sort(charFromAnagram);
			    return Arrays.equals(charFromWord, charFromAnagram);
			
			}
	
	}


