package Access_specifiers.p1;

public class C1P1 {
    private int privatevar=100;
    int defaultvar=20;
    public int publicvar=50;
    protected int protectedVar = 4 ;
    static protected int protectedStaticVar = 5;


    public static void main(String[] args) {
        C1P1 c1p1=new C1P1();
        //private variable accessed within the class
        //System.out.println(c1p1.privatevar);
        //default can be accessed
        //System.out.println(c1p1.defaultvar);
        System.out.println(c1p1.publicvar);
    }
}
