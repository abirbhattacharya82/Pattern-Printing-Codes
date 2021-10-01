package java_patterns;

import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		
		for(int i=1;i<=(no/2);i++)
		{
			for(int j=1;j<=no;j++)
			{
				if(j==1||j==no)
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
			for(int b=1;b<=no;b++)
			{
				if(b==1||b==no||a==b||a+b==no+1)
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
		
		}

	}


