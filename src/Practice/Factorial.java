package Practice;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int i = 1;
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        int fact = Factorial1(n1);
        /*for(i=1;i<=n1;i++){
            fact=fact*i;
        }
         while(i<=n1) {
            fact=fact*i;
            i++;
        }*/
        System.out.println(fact);
    }

    public static int Factorial1(int n) {
        if (n == 0) {
            return 1;
        } else {
            return(n*Factorial1(n-1));
        }
    }
}