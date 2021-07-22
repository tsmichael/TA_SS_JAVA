public class Fibonacci {

    private int startInterval;

    private int endInterval;

    private int f1, f2;

    public int n;

    public Fibonacci() {
    }

    public Fibonacci(int start, int end, int n) {
        setInterval(start, end);
        this.n = n;
    }

    public void setInterval(int start, int end) {
        this.startInterval = start;
        this.endInterval = end;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void sumInterval() {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = this.startInterval; i <= this.endInterval; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of even numbers inside interval is " + sumEven);
        System.out.println("Sum of odd numbers inside interval is " + sumOdd);
    }

    public void initF1F2() {
        if (this.endInterval % 2 == 0) {
            f2 = this.endInterval;
            f1 = f2 - 1;
        } else {
            f1 = this.endInterval;
            f2 = f1 - 1;
        }
    }

    public void runFibonacci() {
        int countEvenFibonacci = 0;
        int countOddFibonacci = 0;

        int firstElement, secondElement;
        if (f1 > f2) {
            firstElement = f2;
            secondElement = f1;
        } else {
            firstElement = f1;
            secondElement = f2;
        }

        if (n == 0 || n == 1) {
            System.out.println("your Fibonacci number is " + firstElement+ " for N="+n);
            if (firstElement % 2 == 0) {
                System.out.println("100% of even numbers");
            } else {
                System.out.println("100% of odd numbers");
            }
        } else if (n == 2) {
            System.out.println("your Fibonacci number is " + secondElement+ " for N="+n);
            System.out.println("50% of even and odd numbers");
        } else {
            for (int i = 2; i <= n; i++) {
                int newFibonacci = firstElement + secondElement;

                if (newFibonacci % 2 == 0) {
                    countEvenFibonacci++;
                } else {
                    countOddFibonacci++;
                }

                firstElement = secondElement;
                secondElement = newFibonacci;
            }

            System.out.println("Your last Fibonacci number is " + secondElement+ " for N="+n);
            getPercentage(countOddFibonacci + 1, countEvenFibonacci + 1);
        }
    }

    private void getPercentage(int oddCount, int evenCount) {
        double oddPercent = oddCount * 100 / (oddCount + evenCount);
        double evenPercent = evenCount * 100 / (oddCount + evenCount);

        System.out.println("Fibonacci run got " + oddPercent + "% of odd numbers and " + evenPercent + "% of even numbers");
    }

}
