# Python Program for printing Fibonacci Numbers upto N

def printFibonacciNumbers(n):
 
    a = 0
    b = 1
    if (n < 1):
        return
    for x in range(n):
        print(a, end=" ")
        a, b = b, a+b
 
 
# Driver code
if __name__ == "__main__":
    n = int(input("Enter N: "))
    printFibonacciNumbers(n)
