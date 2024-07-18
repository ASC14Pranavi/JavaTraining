package exceptions;

public class Unhandled {
    public static void main(String[] args) {
        String TestString = "Welcome";
        String uppercase = TestString.toUpperCase();
        System.out.println(uppercase);
        System.out.println("Caller begin");
        called();
        System.out.println("Back to caller");
    }
    private static void called(){
        System.out.println("The calculator app");
        int num1=0,num2=200;
        int result=num2/num1;
        System.out.println(result);
        System.out.println("Shutting down calculator");

    }
}
