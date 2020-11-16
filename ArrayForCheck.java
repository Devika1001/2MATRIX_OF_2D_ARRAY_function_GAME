package com.firstprogram.abc;
import java.util.*;

/**
 * interface Matrix1
 
{
	public void upprerTringularMatrix();
	public void lowerTringularMatrix();
	public void diagonalElementsMatrix();
	public void sumOfDiagonalElementOfMatrix();
	public void checkUnitMatrix();
	public void rightDiagonalElement();
	public void sumOfrightDiagonalElement();
	
}
*/

 class ArrayForCheck 
{
	 
	 
	 public static void main(String[] args)
		{
//		 ArrayForCheck afc=new ArrayForCheck();
//	         afc.printingMatrix();
	       
			MethodMatrix1 mt=new MethodMatrix1();
//			mt.upprerTringularMatrix();
//			mt.lowerTringularMatrix();
//			mt.diagonalElementsMatrix();
//			mt.sumOfDiagonalElementOfMatrix();
    		mt.checkUnitMatrix();
//     		mt.rightDiagonalElement();
//			mt.sumOfrightDiagonalElement();
		}
			
	 
	public static int a[][];
	public static void printingMatrix()
	{
	 Scanner scan= new Scanner(System.in);
   	 System.out.println("enter the row value");
   	 int i=scan.nextInt();
   	 System.out.println("enter colmn value");
   	 int j=scan.nextInt();
   	 System.out.println("enter array elements");
	     int a[][]=new int[i][j];
	     for(i=0;i<=a.length-1;++i)
	     {
	    	 for(j=0;j<=a[i].length-1;++j)
	    	 {
	    		 a[i][j]=scan.nextInt();
	    	 }
	     }
	     System.out.println("array of array is or regular matrix  is");
	     for(i=0;i<=a.length-1;++i)
	     {
	    	 for(j=0;j<=a[i].length-1;++j)
	    	 {
	    	 System.out.print(a[i][j]+"\t");
	    	 }System.out.println();
	     }
	     
	}
	}
		
 class MethodMatrix1 extends ArrayForCheck 
{
	public  static  void upprerTringularMatrix()
	{

		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("uppertringular Matrix");
		 for( i=0;i<=a.length-1;++i)
	     {
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		if(i<j)
		{
			System.out.print(a[i][j]+"\t");
		}
		else
		{
			System.out.print(0+"\t");
		}
		
	}System.out.println();
	     }
	}


	public static void lowerTringularMatrix() 
	{

		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("lower tringular matrix");
		 for( i=0;i<=a.length-1;++i)
	     {
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		if(i>j)
		{
			System.out.print(a[i][j]+"\t");
		}
		else
		{
			System.out.print(0+"\t");
		}
		
	       }System.out.println();
	     }
	}

	public static void diagonalElementsMatrix()
	{
       System.out.println("diagonal elements of array");
		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("diagonal elements of array");
		 for( i=0;i<=a.length-1;++i)
	     {
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i!=j)
		       {
			        System.out.print("");
		       }
		         else
		      {
			       System.out.print(a[i][j]+"\t");
		      }
	        }System.out.print("\t");
	     }
	}

	public static void sumOfDiagonalElementOfMatrix() 
	{
         System.out.println("sum of diagonal element");
		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("sum of diagonal elements");
		int sum=0;
		 for( i=0;i<=a.length-1;++i)
	     { 
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i==j)
		       {
		        	
				       sum+=a[i][j];
		       }
		         else
		      {
			       System.out.print("");
		      }
	        }
	     }System.out.println(sum);
		
	}

	public static void checkUnitMatrix() 
	{
		System.out.println("check wether the given matrix is unit matrix or identity matrix");
		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("checking the matrix is unit matrix or not");

		 for( i=0;i<=a.length-1;++i)
	     { 
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i==j&&a[i][j]!=1)
		            {
		        	 System.out.println("it is not  unit matrix");
	        		 System.exit(0);
		            }
		         else if(i!=j&&a[i][j]!=0)
		        	 { System.out.println("it is not  unit matrix");
		        		 System.exit(0);
		        	 }
	        }
	     }
		 
        	 System.out.println("its is unit matrix");
        	 System.exit(0);
         
	}

	public static void rightDiagonalElement()
	{
		System.out.println("find the rightdiagonal element");

		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("Right diagonal elements are");
		 for( i=0;i<=a.length-1;++i)
	     {
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i==((a[i].length)-j-1))
		       {
		        	 System.out.print(a[i][j]+"\t");
		       }
		        
	        }
	     }
		
	}


	public static void sumOfrightDiagonalElement() 
	{
        System.out.println("sumof diagonal element");
		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("diagonal elements are");
		int sum=0;
		 for( i=0;i<=a.length-1;++i)
	     {
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
	    		 if(i==((a[i].length)-j-1))
		       {
	    			 System.out.print(a[j][i]+"\t");
	    			 sum+=a[j][i];
		       }
	        }
	     }System.out.println("\n"+"\n"+sum+"\tis the sum of diagonal element");

		
	}
	
}
	     
	     
	     
	     
	

