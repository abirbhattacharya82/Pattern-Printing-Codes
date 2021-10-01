// Fibonacci sequence with memoization.

class Fibonacci {
    public int fib(int n) {
        return fibo(n, new int[n+1]);
    }
    int fibo(int i, int[] memo) {
        if(i == 0 || i == 1) {
            return i;
        }
        if(memo[i] == 0) {
            memo[i] = fibo(i-1, memo) + fibo(i-2, memo);
        }
        return memo[i];
    }
}