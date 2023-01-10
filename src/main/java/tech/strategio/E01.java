package tech.strategio;

public class E01 {
    public int getNthFib(int n) {
        return fib(n-1);
    }

    private int fib(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : fib(n-2) + fib(n-1);
    }
}
