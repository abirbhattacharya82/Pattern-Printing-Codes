package com.sujalsamai.Pattern;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        System.out.println("Pattern Output: ");
        pascal(n);
    }
    static void pascal(int rows) {
        int coe=1;
        for(int i = 0; i < rows; i++) {
            for(int space = 1; space < rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coe = 1;
                else
                    coe = coe * (i - j + 1) / j;

                System.out.printf("%4d", coe);
            }
            System.out.println();
        }
    }
}
