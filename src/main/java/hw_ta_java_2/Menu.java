package hw_ta_java_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {
    public InputStreamReader stream_Reader = new InputStreamReader(System.in);
    public BufferedReader keyboard = new BufferedReader(stream_Reader);

    private boolean flag = true;

    public void menuInfo() {
        System.out.println("\n----------------------------");
        for (MenuConsole ms : MenuConsole.values()) {
            System.out.println(ms);
        }
    }

    public void brandOfCarChoice() {
        System.out.println("1) BMW\n2) Mercedes");
    }

    public void menuRunOption() throws IOException {
        List<Car> cars = new ArrayList<>();
        while (flag) {
            menuInfo();
            System.out.println("What do you want to do?..");

            int choice = handlingOFIncorrectInput();
            String textFromConsole;
            switch (choice) {
                case 1:
                    System.out.println("Choose the brand of your car");
                    brandOfCarChoice();
                    int brandChoice = handlingOFIncorrectInput();
                    switch (brandChoice) {
                        case 1:
                            BMW bmw = new BMW();
                            bmw.setBrand("BMW");
                            System.out.println("Lets choose your MODEL: ");
                            textFromConsole = keyboard.readLine();
                            bmw.setModel(textFromConsole);

                            cars.add(bmw);
                            break;
                        case 2:
                            Mercedes mercedes = new Mercedes();
                            mercedes.setBrand("Mercedes");
                            System.out.println("Lets choose your MODEL: ");
                            textFromConsole = keyboard.readLine();
                            mercedes.setModel(textFromConsole);

                            cars.add(mercedes);
                            break;
                        default:
                            System.out.println("Wash your eyes and do proper choice");
                            break;
                    }
                    break;
                case 2:
                    if (!cars.isEmpty()) {
                        System.out.println("Current list has " + cars.size() + " objects - pick up index of a car which you wanna remove");
                        int index = handlingOFIncorrectInput();
                        cars.remove(index);
                    } else {
                        System.out.println("Sorry you can not do that!");
                    }
                    break;
                case 3:
                    System.out.println("{----YOUR GARAGE----}");
                    for (Car car : cars) {
                        System.out.println(car);
                    }
                    break;
                case 4:
                    cars = cars.stream()
                            .sorted(Comparator.comparing(o -> o.getBrand()))
                            .collect(Collectors.toList());
                    System.out.println("List is sorted by brand");
                    break;
                case 5:
                    System.out.println("BYE ^-^ HAVE A NICE DAY");
                    flag = false;
                    break;
                default:
                    System.out.println("Open your eyes and stop typing blindly\n");
                    break;
            }
        }
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
