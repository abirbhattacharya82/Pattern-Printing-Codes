package java_patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			for(int j=no;j>=i;j--)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
