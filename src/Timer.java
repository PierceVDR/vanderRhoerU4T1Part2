import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to count up to? ");
        int countTo = scanner.nextInt();

        int counter = 1;
        while (true) {
            System.out.println(counter);
            if (counter>=countTo) {break;}
            counter++;
        }
    }
}