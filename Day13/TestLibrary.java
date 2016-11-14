import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary {
    Library newLibrary;

    @Before
    public void librarySetUp() {
        newLibrary = new LibraryImpl("Birkbeck Library", 123, 3);
    }

    @Test
    public void testGetLibraryName() {
        assertEquals("Birkbeck Library", newLibrary.getLibraryName());
    }

    @Test
    public void testGetLibraryID() {
        assertEquals(123, newLibrary.getLibraryID() );
    }

    @Test
    public void getMaxBooksPerUser() {
        assertEquals(3, newLibrary.getMaxBooksPerUser());
    }

    @Test 
    public void setMaxBooksPerUser() {
        newLibrary.setMaxBooksPerUser(6);
        assertEquals(6, newLibrary.getMaxBooksPerUser());
    }
    
}