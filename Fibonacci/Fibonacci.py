# Python Program for printing Fibonacci Numbers upto N

def printFibonacciNumbers(n):
 
    a = 0
    b = 1
    if (n < 1):
        return
    print(a, end=" ")
    for x in range(1, n):
        print(b, end=" ")
        c = a + b
        a = b
        b = c
 
 
# Driver code
if __name__ == "__main__":
    n = int(input("Enter N"))
    printFibonacciNumbers(n)
