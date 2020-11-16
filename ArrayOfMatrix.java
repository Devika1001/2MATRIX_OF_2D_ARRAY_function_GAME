package com.firstprogram.abc;
import java.util.*;
import com.firstprogram.abc.ArrayForCheck;
import com.firstprogram.abc.MethodMatrix1;

public class ArrayOfMatrix 
{

	public static void main(String[] args)
	{ MethodMatrix1 mt=new MethodMatrix1();
	
		System.out.println("enter your choice");
		System.out.println("choose 0 print array of array");
		System.out.println("choose 1 to find upper tringular matrix");
		System.out.println("choose 2 to find lower tringular matrix");
		System.out.println("choose 3 to find diagonal element");
		System.out.println("choose 4 to find sum of diagonal element");
		System.out.println("choose 5 to check wether it is unitmatrix or not");
		System.out.println("choose 6 to find right diagonal element");
		System.out.println("choose 7 to find sum of right diagonal element");
		
		Scanner scan= new Scanner(System.in);
		
		int choice=scan.nextInt();
		if(choice==0)
		{
		ArrayForCheck afc=new ArrayForCheck();
        afc.printingMatrix();
		}
		if(choice==1)
		{
		mt.upprerTringularMatrix();
		}
		if(choice==2)
		{
		mt.lowerTringularMatrix();
		}
		if(choice==3)
		{
		mt.diagonalElementsMatrix();
		}
		if(choice==4)
		{
		mt.sumOfDiagonalElementOfMatrix();
		}
		if(choice==5)
		{
		mt.checkUnitMatrix();
		}
		if(choice==6)
		{
		mt.rightDiagonalElement();
		}
		if(choice==7)
		{
		mt.sumOfrightDiagonalElement();
		}
		else
		{
			System.out.print("invalid choice");
		}
	}

}
