import junit.framework.TestCase;

public class PalidromeTest extends TestCase {

    public void testCheckPalidrome1() {

        Palidrome pl = new Palidrome();
        pl.setText("mom");
        System.out.println("inside test1");
        assertEquals(true,pl.checkPalidrome());


    }

    public void testCheckPalidrome2() {

        Palidrome pl = new Palidrome();
        pl.setText("MOm");
        assertEquals(true,pl.checkPalidrome());


    }

    public void testCheckPalidrome3() {

        Palidrome pl = new Palidrome();
        pl.setText("radar");
        assertEquals(true,pl.checkPalidrome());


    }

    public void testCheckPalidrome4() {

        Palidrome pl = new Palidrome();
        pl.setText("vohra");
        assertEquals(true,pl.checkPalidrome());


    }
}
