package Assignment1;
public class Largest{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int largest = Largestnum(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
    }

    public static int Largestnum(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
