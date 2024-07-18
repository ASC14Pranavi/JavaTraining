package exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("UE");
        int i=100;
        int j=0;
        try{
            String string=null;
            System.out.println("try");
            j=i/0;
            System.out.println("Value:"+j);
        }
        catch(NullPointerException nullPointerException){
            System.out.println("Null      ");
        }

        finally{
            System.out.println("finally");
        }
        System.out.println("executed");
    }
}
