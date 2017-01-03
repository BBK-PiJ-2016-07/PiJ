
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TestContact {
     private Contact newContact;
     @Before
     public void setUpContact(){
         newContact = new ContactImpl(1, "Bilal", "This is a test");
     }

     @Before
     public void setUpContact1(){
          newContact = new ContactImpl(1, "Bilal");
     }

     @Test
     @Ignore
     public void testGetID(){
        assertEquals(1, newContact.getID());
     }

     @Test
     @Ignore
     public void testGetContactName(){
        assertEquals("Bilal", newContact.getName());
     }
     @Test
     @Ignore
     public void testGetNotes(){
        assertEquals("This is a test", newContact.getNotes());
     }

}
