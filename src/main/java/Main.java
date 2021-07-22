public class Main {

    public static void main(String... args) {
        System.out.println("Hello, world!");

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.setInterval(0,5);
        fibonacci.sumInterval();

        fibonacci.initF1F2();
        fibonacci.setN(5);
        fibonacci.runFibonacci();
    }
}
