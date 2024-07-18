package Assignment;

public class   Multiplication {
    public static void displayMultiplicationFor(int num) {
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
    public static void main(String[] args) {
        int num=2;
        displayMultiplicationFor(num);
    }
}

