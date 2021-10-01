#include<stdio.h> // include stdio.h

int main() 
{
    int n;

    printf("Enter number of lines: ");
    scanf("%d", &n);

    printf("\n");

    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}