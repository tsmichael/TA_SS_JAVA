package hw_ta_java_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleOperation {
    public InputStreamReader stream_Reader = new InputStreamReader(System.in);
    public BufferedReader keyboard = new BufferedReader(stream_Reader);

    public void menu() throws IOException {
        int start = 0;
        int end = 0;
        int n = 0;
        System.out.println("-------------------| Hello COWBOY |--------------------");
        System.out.println("Let`s input interval for your fibonacci game");

        System.out.println("input start of interval");
        start = handlingOFIncorrectInput();

        System.out.println("input end of interval");
        end = handlingOFIncorrectInput();

        System.out.println("input N for fibonacci search");
        n = handlingOFIncorrectInput();

        Fibonacci fibonacci = new Fibonacci(start, end, n);
        fibonacci.sumInterval();
        fibonacci.initF1F2();
        fibonacci.runFibonacci();

    }

    public int handlingOFIncorrectInput() throws IOException {
        int console = 0;
        try {
            console = Integer.parseInt(keyboard.readLine());
        } catch (Exception NumberFormatException) {
            System.out.println("Sorry your input is bad, try again");
            handlingOFIncorrectInput();
        }
        return console;
    }
}
