package Assignment1;
import java.util.Scanner;

public class NumbertoWords {

        public static void printWords(int number) {
            String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;
            System.out.println(words[hundreds] + " " + words[tens] + " " + words[units]);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a 3-digit number:");
            int number = scanner.nextInt();
            if (number >= 100 && number <= 999) {
                printWords(number);
            } else {
                System.out.println("Please enter a valid 3-digit number.");
            }

            scanner.close();
        }
    }


