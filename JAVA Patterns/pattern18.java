package java_patterns;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int no=sc.nextInt();
     int sp=no/2;
     int st=1;
      
     for(int i=1;i<=(no/2);i++)
     {
    	 for(int j=1;j<=no;j++)
    	 {
    		 if(i==j||i+j==no+1||i==1)
    		 {
    			 System.out.print("*\t");
    		 }
    		 else
    		 {
    			 System.out.print("\t");
    		 }
    	 }
    	 System.out.println();
     }
     
     for(int a=(no/2)+1;a<=no;a++)
     {
    	 for(int x=1;x<=sp;x++)
    	 {
    		 System.out.print("\t");
    	 }
    	 for(int x=1;x<=st;x++)
    	 {
    		 System.out.print("*\t");
    	 }
    	 for(int x=1;x<=sp;x++)
    	 {
    		 System.out.print("\t");
    	 }
    	 sp--;
    	 st+=2;
    	 System.out.println();
     }
    	 
     }

	}

