package com.firstprogram.abc;
import java.util.Scanner;
import com.firstprogram.abc.PrintingArrays ;
import com.firstprogram.abc.ArraysAddistion;
import com.firstprogram.abc.AddAllElements;
import com.firstprogram.abc.TransposeMatrixes;
import com.firstprogram.abc.MultiplcationOfArrays;
import com.firstprogram.abc.MultiplicationOfAllElement;
import com.firstprogram.abc.MulAllElementsOfOneArray;



class CheckFunction 
{
	static void doOperation(int operation)
	{ 
	
		
		if(operation==1)
		{

			PrintingArrays pa=new PrintingArrays();
			pa.arrayPattern();
			
		}
		else if(operation==2)
		{
			ArraysAddistion ad=new ArraysAddistion();
			ad.addistionArrays();
		}
		else if(operation==3)
		{
			AddAllElements ae=new AddAllElements();
			ae.addAllElement();
		}
		else if(operation==4)
		{
			TransposeMatrixes at=new TransposeMatrixes();
			at.transposeMatrixes();
		}
		else if(operation==5)
		{
			MultiplcationOfArrays am=new MultiplcationOfArrays();
			am.multiplication();
		}
		else if(operation==6)
		{
			MultiplicationOfAllElement mae=new MultiplicationOfAllElement();
			mae.multiplicationOfElemant();
		}
		else if(operation==7)
		{
			MulAllElementsOfOneArray m1e=new MulAllElementsOfOneArray();		
			m1e.mulallAllElementsOfOneArray();

		}
		else
		{
			System.out.print("you have entered thr invalid number" );
		}
	}
}
class ArrayFunctionCheck
{
	public static  void main(String[] args) 
	{
		System.out.println("only 8 chances to choose your operation");
		System.out.println("enter your chosing opration by selecting number between 1 to 7");
		System.out.println("for write 2 dimentional array choose=1");
		System.out.println("for adding two array=2");
		System.out.println("to add all element of array choose=3");
		System.out.println("for finding transpose of array choose=4");
		System.out.println("for finding multiplication of two array choose=5");
		System.out.println("for finding multiplication of all element choose=6");
		System.out.println("for finding multiplication of all element of one array =7");

		
		System.out.println("choose your operation");
		for(int n=0;n<=8;++n)
		{
			Scanner scan = new Scanner(System.in);
			int operation=scan.nextInt();
			CheckFunction c=new CheckFunction();
			c.doOperation(operation);
			
		}
		
	}

}


