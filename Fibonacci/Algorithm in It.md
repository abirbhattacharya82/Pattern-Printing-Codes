## Using Recursive fucntion

Here's the sudo code:

```
function finboRecursive(int n){
      if(n==1 || n==0) return n;
      return fib(n-1)+fib(n-2);
}
```

## Using Iteration

```
function fiboIterative(int n) {

      int previouspreviousNumber, previousNumber = 0, currentNumber = 1;

        for (int i = 1; i < n ; i++) {

            previouspreviousNumber = previousNumber;

            previousNumber = currentNumber;

            currentNumber = previouspreviousNumber + previousNumber;

        }
        return currentNumber;
}
```
