package GetOfferSolutions;

public class Fibonacci {
	public int Fibonacci(int n) {
        if(n==1)
            return 1;
        if(n ==2)
            return 2;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
