package Access_specifiers.p2;

import Access_specifiers.p1.C1P1;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class C3P2 {
    public static void main(String[] args) {
        C1P1 c1p1 = new C1P1();
        //private variable accessed in other package and class is denied
        //System.out.println(c1p1.privatevar);
        //System.out.println(c1p1.defaultvar);
        System.out.println(c1p1.publicvar);
    }
}
