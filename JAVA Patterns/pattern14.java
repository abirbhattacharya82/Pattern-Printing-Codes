package java_patterns;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"X"+i+"="+no*i);
		}

	}

}
