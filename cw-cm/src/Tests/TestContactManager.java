
import Impl.ContactManagerImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class TestContactManager {
    private ContactManager myCM;
    @Before
    public void setUpContactManager(){
        myCM = new ContactManagerImpl(1, "Bilal", "This is a test");
    }

    @Test
    @Ignore

}