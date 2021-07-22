public class Fibonacci {

    private int startInterval;

    private int endInterval;

    public void setInterval(int start, int end) {
        this.startInterval = start;
        this.endInterval = end;
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
        System.out.println("Sum of even numbers inside interval is "+ sumEven);
        System.out.println("Sum of odd numbers inside interval is "+ sumOdd);
    }
}
