package org.example;


import java.text.NumberFormat;
import java.util.Scanner;

/**
 * File_Name: Tax_Calculator
 * Coding Language: Java
 * Author: Danica Davies
 * Date of creation: 20/10/23
 * Date of last update: 20/10/23
 * Description: A basic Tax calculation system with the given tax rates listed below:
 * £0 to £14,999: 0%
 * 15.000 to 19,999: 10%
 * 20,000 to 29,999: 15% Tax
 * 30,000 to 44,999: 20% Tax
 * 45,000+ = 25% tax **/
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Salary:");
        int Salary = myObj.nextInt();
        int percentage;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        if(Salary < 0)
        {
            System.out.println("Invalid Salary please enter a number above 0");
        }
        else if (Salary < 15000 && Salary > 0)
        {
            System.out.println("Gross Total Salary" + formatter.format(Salary));
            System.out.println("Tax Bracket: 0%");
            System.out.println("Tax Taken = ");
            System.out.println("Final Salary = " + formatter.format(Salary));
        }
        else if (Salary < 20000 && Salary > (15000-1))
        {
            System.out.println("Gross Total Salary:" + formatter.format(Salary));
            System.out.println("Tax Bracket: 10%");
            percentage = Salary / 100 * 10;
            System.out.println("Tax Taken =" + formatter.format(percentage));
            System.out.println("Final Salary = " + formatter.format(Salary - percentage));
        }
        else if (Salary < 30000 && Salary > (20000-1))
        {
            System.out.println("Gross Total Salary:" + formatter.format(Salary));
            System.out.println("Tax Bracket: 15%");
            percentage = Salary / 100 * 15;
            System.out.println("Tax Taken = " + formatter.format(percentage));
            System.out.println("Final Salary = " + formatter.format(Salary - percentage));
        }
        else if (Salary < 45000 && Salary > (30000-1))
        {
            System.out.println("Gross Total Salary: " + formatter.format(Salary));
            System.out.println("Tax Bracket: 20%");
            percentage = Salary / 100 * 20;
            System.out.println("Tax Taken = " + formatter.format(percentage));
            System.out.println("Final Salary = " + formatter.format(Salary - percentage));
        }
        else if (Salary >= 45000)
        {
            System.out.println("Gross Total Salary: " + formatter.format(Salary));
            System.out.println("Tax Bracket: 25%");
            percentage = Salary / 100 * 25;
            System.out.println("Tax Taken = " + formatter.format(percentage));
            System.out.println("Final Salary = " + formatter.format(Salary - percentage));
        }
    }
}
