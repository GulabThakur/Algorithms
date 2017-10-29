package com.bridgebazs;
import com.bridgeLabzs.utility.Utility;
import java.util.Scanner;


public class DayOfWeek {
   public static void main(String[] args) {
   System.out.println("Program Started");
   Utility utility=new Utility();
   System.out.println("Day of Week is :");
   Scanner scanner=new Scanner(System.in);
   int day,month,year;
   System.out.println("Enter the day ");
   day=scanner.nextInt();
   System.out.println("Enter the month");
   month=scanner.nextInt();
   System.out.println("Enter the year ");
   year=scanner.nextInt();
   System.out.print("Week of the day is ");
   utility.dayOfWeek(day,month,year);
  System.out.println("Program Ended");
}
}
