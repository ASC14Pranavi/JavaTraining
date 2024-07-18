package Practice;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int n,original,rem,sum=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        original=n;
        while(n!=0) {
            rem = n % 10;
            sum += Math.pow(rem, 3);
            n /= 10;
        }
        if(original==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armstrong");
        }
    }


}
