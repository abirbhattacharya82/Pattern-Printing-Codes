package java_patterns;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int no1=0;
		int no2=1;
		int temp;
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no1+"\t");
				 temp=no1+no2;
				 no1=no2;
				 no2=temp;
			}
			
			System.out.println();
		}

	}

}
