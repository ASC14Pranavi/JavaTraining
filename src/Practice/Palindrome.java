package Practice;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        /*int r,sum=0;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }*/
        String reverse="";
        Scanner obj=new Scanner(System.in);
        String original= obj.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        if(original.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
