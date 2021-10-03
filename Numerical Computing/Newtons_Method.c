#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double f(double x) {
    return x - cos(x);                  //The function whose roots we have to find
}

double df(double x) {
    return 1 + sin(x);                  //The derivative of the function
}

int main() {
    double a, a1, a2, epsilon;

    printf("Starting Point 1: ");
    scanf("%lf", &a1);
    printf("Starting Point 2: ");
    scanf("%lf", &a2);
    printf("Limit of accuracy: ");                      //Like if precision is 5 then input is 0.00001
    scanf("%lf", &epsilon);
    a = (a1 + a2) / 2;
    double c = a, fa = f(a), fc = fa;
    do {
        a = c;
        fa = fc;
        c = a - fa / df(a);
        fc = f(c);
    } while (fc != 0 && fabs(fc - fa) > epsilon && fabs(c - a) > epsilon);

    printf("The root of the function for the desired level of accuracy is: %lf\n", c);
    return 0;
}