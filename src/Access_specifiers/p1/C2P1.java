package Access_specifiers.p1;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class C2P1 {
    public static void main(String[] args) {


        C1P1 c1p1 = new C1P1();
        //private variable accessed in other class is denied
        //System.out.println(c1p1.privatevar);
        //default can be accessed
        //System.out.println(c1p1.defaultvar);
        System.out.println(c1p1.publicvar);
    }
}
