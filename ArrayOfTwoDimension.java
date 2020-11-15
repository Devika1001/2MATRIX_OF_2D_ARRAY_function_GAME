package com.firstprogram.abc;
import java.util.Scanner;

public class ArrayOfTwoDimension 
{
	

	public static void main(String[] args) 
	{
		
//		PrintingArrays pa=new PrintingArrays();
//		pa.arrayPattern();
//		PrintingArrays pb=new PrintingArrays();
//		pb.arrayPattern();
//	    ArraysAddistion ad=new ArraysAddistion();
//		ad.addistionArrays();
//		AddAllElements ae=new AddAllElements();
//		ae.addAllElement();
//		SubtractionArray as=new SubtractionArray();
//		as.subtractionArray();
//		SubtractingAllElements sea=new SubtractingAllElements();
//		sea.subtractingAllElements();
//		TransposeMatrixes at=new TransposeMatrixes();
//		at.transposeMatrixes();
//		MultiplcationOfArrays am=new MultiplcationOfArrays();
//		am.multiplication();
//		
//		MulAllElementsOfOneArray m1e=new MulAllElementsOfOneArray();		
//		m1e.mulallAllElementsOfOneArray();
		}
	

	}


 class PrintingArrays 

{
	public static int i;
	public static int j;
	public static int a[][];
	public static int b[][];
	public static int c[][];
	
	static void arrayPattern() {
	System.out.println("printing 2d array");
	Scanner scan= new Scanner(System.in);
	
	System.out.println("enter row value");
	int i=scan.nextInt();
	
	System.out.println("enter column value");
	int j=scan.nextInt();
	
	
	int a[][]=new int[i][j];
	System.out.println("enter array elements");
	for( i=0;i<=a.length-1;++i)
	{
		for( j=0;j<=a[i].length-1;++j)
		{
			
			a[i][j]=scan.nextInt();
		}
		
	}
	
	for( i=0;i<=a.length-1;++i)
	{
		for(j=0;j<=a[i].length-1;++j)
		{
			System.out.print((a[i][j]+"\t"));
		}System.out.print("\n");
	
	}
	}
}
class ArraysAddistion extends PrintingArrays 
{
	static void addistionArrays() 
	{
		System.out.println("sum of two arrays");
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter row value");
		int i=scan.nextInt();
		
		System.out.println("enter column value");
		int j=scan.nextInt();
		
		
		
		int a[][]=new int[i][j];
		System.out.println("enter a-array elements");
		for( i=0;i<=a.length-1;++i)
		{
			for( j=0;j<=a[i].length-1;++j)
			{
				
				a[i][j]=scan.nextInt();
			}
			
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print((a[i][j]+"\t"));
			}System.out.print("\n");

		}
			
			int b[][]=new int[i][j];
			System.out.println("enter b-array elements");
			for( i=0;i<=b.length-1;++i)
			{
				for( j=0;j<=b[i].length-1;++j)
				{
					
					b[i][j]=scan.nextInt();
				}
				
			}
			
			for( i=0;i<=b.length-1;++i)
			{
				for(j=0;j<=b[i].length-1;++j)
				{
					System.out.print((b[i][j]+"\t"));
				}System.out.print("\n");
				
			}
				int c[][]=new int[i][j];
				System.out.println("printing sum of two array elements");
		
		for( i=0;i<=c.length-1;++i)
		{
			for(j=0;j<=c[i].length-1;++j)
			{
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		for( i=0;i<=c.length-1;++i)
		{
			for(j=0;j<=c[i].length-1;++j)
			{
				System.out.print(c[i][j]+"\t");
				
			}System.out.println();
		}
	}
	}
	class AddAllElements
	{
		static void addAllElement() 
		{
			
			System.out.println("sum of two arrays");
			Scanner scan= new Scanner(System.in);
			
			System.out.println("enter row value");
			int i=scan.nextInt();
			
			System.out.println("enter column value");
			int j=scan.nextInt();
			
			
			
			int a[][]=new int[i][j];
			System.out.println("enter a-array elements");
			for( i=0;i<=a.length-1;++i)
			{
				for( j=0;j<=a[i].length-1;++j)
				{
					
					a[i][j]=scan.nextInt();
				}
				
			}
			
			for( i=0;i<=a.length-1;++i)
			{
				for(j=0;j<=a[i].length-1;++j)
				{
					System.out.print((a[i][j]+"\t"));
				}System.out.print("\n");

			}
			
			System.out.println("sum of all elements in array");
			int sum=0;
			for( i=0;i<=a.length-1;++i)
			{
				for(j=0;j<=a[i].length-1;++j)
				{
				sum=sum+a[i][j];
					
				}System.out.print("\n");

			}System.out.println(sum);
			

		}
	}
	
	
	class SubtractionArray{
		void subtractionArray()
		{
			System.out.println("subtraction of two arrays");
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter row value");
		int i=scan.nextInt();
		
		System.out.println("enter column value");
		int j=scan.nextInt();
		
		
		
		int a[][]=new int[i][j];
		System.out.println("enter a-array elements");
		for( i=0;i<=a.length-1;++i)
		{
			for( j=0;j<=a[i].length-1;++j)
			{
				
				a[i][j]=scan.nextInt();
			}
			
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print((a[i][j]+"\t"));
			}System.out.print("\n");

		}
			
			int b[][]=new int[i][j];
			System.out.println("enter b-array elements");
			for( i=0;i<=b.length-1;++i)
			{
				for( j=0;j<=b[i].length-1;++j)
				{
					
					b[i][j]=scan.nextInt();
				}
				
			}
			
			for( i=0;i<=b.length-1;++i)
			{
				for(j=0;j<=b[i].length-1;++j)
				{
					System.out.print((b[i][j]+"\t"));
				}System.out.print("\n");
				
			}
				int c[][]=new int[i][j];
				System.out.println("printing subtracted value of two array elements");
		
		for( i=0;i<=c.length-1;++i)
		{
			for(j=0;j<=c[i].length-1;++j)
			{
				c[i][j]=a[i][j]-b[i][j];
				
			}
		}
		for( i=0;i<=c.length-1;++i)
		{
			for(j=0;j<=c[i].length-1;++j)
			{
				System.out.print(c[i][j]+"\t");
				
			}System.out.println();
		}
	}	
	}
class SubtractingAllElements
{
	void subtractingAllElements()
	{
		System.out.println("sum of two arrays");
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter row value");
		int i=scan.nextInt();
		
		System.out.println("enter column value");
		int j=scan.nextInt();
		
		
		
		int a[][]=new int[i][j];
		System.out.println("enter a-array elements");
		for( i=0;i<=a.length-1;++i)
		{
			for( j=0;j<=a[i].length-1;++j)
			{
				
				a[i][j]=scan.nextInt();
			}
			
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print((a[i][j]+"\t"));
			}System.out.print("\n");

		}
		
		System.out.println("subtractoin of all elements in array");
		int sub=0;
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
			sub-=(a[i][j]);
			sub=-sub;
				
			}System.out.print("\n");

		}System.out.println(sub);
	}
}
class TransposeMatrixes
{
	void transposeMatrixes()
	{
		System.out.println("printing original array");
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter row value");
		int i=scan.nextInt();
		
		System.out.println("enter column value");
		int j=scan.nextInt();
		
		
		int a[][]=new int[i][j];
		System.out.println("enter array elements");
		for( i=0;i<=a.length-1;++i)
		{
			for( j=0;j<=a[i].length-1;++j)
			{
				
				a[i][j]=scan.nextInt();
			}
			
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print((a[i][j]+"\t"));
			}System.out.print("\n");
		
		}
		System.out.print("transport matrix");
		int b[][]=new int[j][i];
		for(j=0;j<=b.length-1;++j) 
		{
			for(i=0;i<=b[j].length-1;++i)
			{
		         b[j][i]=a[i][j];
		    }System.out.println();
		}
		for(j=0;j<=b.length-1;++j) 
		{
			for(i=0;i<=b[j].length-1;++i)
			{
				System.out.print(b[j][i]+"\t");
		    }System.out.println();
		}
		
		
	}
}

class MultiplcationOfArrays
{
	void multiplication()
	{
		System.out.println("multiplication of two arrays");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the row value");
		int i=scan.nextInt();
		System.out.println("enter the column value");
		int j=scan.nextInt();
		System.out.println("enter the value of a-array element");
		
		int a[][]=new int[i][j];
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		
		System.out.println("enter the value of b-array element");
		int b[][]=new int[i][j];
		for( i=0;i<=b.length-1;++i)
		{
			for(j=0;j<=b[i].length-1;++j)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		for( i=0;i<=b.length-1;++i)
		{
			for(j=0;j<=b[i].length-1;++j)
			{
				System.out.print(b[i][j]+"\t");
			}System.out.println();
		}
		
		
		System.out.println("multiplication of two array");
		int c[][]=new int[i][j];
	
		for(i=0;i<=a.length-1;++i) 
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				for(int k=0;k<=b[i].length-1;++k)
				{
					c[i][j]=c[i][j]+a[i][j]*b[i][j];
	
				}
				
			}
		}
		
		for(i=0;i<=a.length-1;++i) 
		{
			for(j=0;j<=a[i].length-1;++j)
			{	
				System.out.print(c[i][j]+"\t");
				}System.out.println();
		}
			
		
	}
}

class MultiplicationOfAllElement
{
	static void multiplicationOfElemant()
	{
		
		System.out.println("multiplication of all elements of two array and sum of resultant array");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the row value");
		int i=scan.nextInt();
		System.out.println("enter the column value");
		int j=scan.nextInt();
		int a[][]=new int[i][j];
		System.out.println("enter a-array element");
		for(i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				a[i][j]=scan.nextInt();
			}
		}
		for(i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		
		int b[][]=new int[i][j];
		System.out.println("enter b-array element");
		for(i=0;i<=b.length-1;++i)
		{
			for(j=0;j<=b[i].length-1;++j)
			{
				b[i][j]=scan.nextInt();
			}
		}
		for(i=0;i<=b.length-1;++i)
		{
			for(j=0;j<=b[i].length-1;++j)
			{
				System.out.print(b[i][j]+"\t");
			}System.out.println();
		}
		
		
		int mul=0;
		int c[][]	=new int[i][j];
		for( i=0;i<=a.length-1;++i)
		{mul=0;
			for(j=0;j<=a[i].length-1;++j)
			{
				mul=mul+a[i][j]*b[i][j];
				c[i][j]=mul;
			}
		}System.out.println(" row wise max value sum of two multiplead array elements\t" +mul);
		
		
		
		System.out.println(" row wise value sum of two multiplead array elements\t");
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print(c[i][j]+"\t");
				
			}System.out.println();
		
		}
		
		
		
		
		
		int d[][]	=new int[i][j];
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				mul=mul+a[i][j]*b[i][j];
				d[i][j]=mul;
			}
		}System.out.println(" maximum value sum of two multiplead array elements\t" +mul);
		
		System.out.println("multiplication and sum of all element");
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				
				System.out.print(d[i][j]+"\t");
			}System.out.print("\n");
		}
		
	}
}






class MulAllElementsOfOneArray
{
	static void mulallAllElementsOfOneArray() 
	{
		
		System.out.println("multiplication of two arrays");
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter row value");
		int i=scan.nextInt();
		
		System.out.println("enter column value");
		int j=scan.nextInt();
		
		
		
		int a[][]=new int[i][j];
		System.out.println("enter a-array elements");
		for( i=0;i<=a.length-1;++i)
		{
			for( j=0;j<=a[i].length-1;++j)
			{
				
				a[i][j]=scan.nextInt();
			}
			
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print((a[i][j]+"\t"));
			}System.out.print("\n");

		}
		
		System.out.println("mul of all elements in array");
		int mul=1;
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
			mul*=a[i][j];
				
			}System.out.print("\n");

		}System.out.println(mul);
		

	}
}
