
import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest { 

@Test
public void testsNormalName() {
	Person p = new Person();
	String input = "Bilal Ahmad"; 
	String output = p.getInitials(input); 
	String expected = "BA"; 
	assertEquals(output, expected);
} 
}


