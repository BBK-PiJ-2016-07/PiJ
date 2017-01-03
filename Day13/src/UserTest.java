import org.junit.*;
import static org.junit.Assert.*;


public class UserTest {
    private User newUser;
    private MockLibrary mockLibrary;

        @Before
        public void userSetup() {
            newUser = new UserImpl("Nate");
            mockLibrary = new MockLibrary(); // needs to exist to pass through methods
        }

        @Test
        public void testUserName() {
            assertEquals("Nate", newUser.getUserName()); 
        }

        @Test
        public void testRegister() {
            newUser.register(mockLibrary);
            assertEquals(456, newUser.getUserID());
        }
       
       @Test
       public void testGetLibrary(){
           assertEquals("MockLibrary", newUser.getLibrary());
       }
        
}