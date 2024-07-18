package test.java.model;
import ecz.model.Add1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Addtest {

    @Test
    public void testAddInt(){
        Add1 add2=new Add1();
        int result=add2.add(50,60);
        assertEquals(110,result);
    }
    @Test
    public void testAddInt1(){
        Add1 add3=new Add1();
        int result=add3.add(25,30,40);
        assertEquals(95,result);
    }
    @Test
    public void testAddDouble(){
        Add1 addf=new Add1();
        double result=addf.add(25.8,30.3);
        assertEquals(56.1,result,0.0001);
    }
    @Test
    public void testAddString(){
        Add1 adds=new Add1();
        String result=adds.add("Hello",30);
        assertEquals("Hello30",result);
    }

}
