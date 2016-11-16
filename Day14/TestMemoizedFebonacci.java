 /**
 * Test time for Febonacci calculation for 40 and 45
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestMemoizedFebonacci{
    private MemoizedFebonacci myFebonacci;

    @Before
    public void setup(){
        myFebonacci = new MemoizedFebonacci();
    }

    @Test
    public void TestFebonacciOf40(){
        int actualFeb40 = 102334155;
        int expectedFeb40 = myFebonacci.fib(40);
        assertEquals(actualFeb40, expectedFeb40);
    }
    /*
    @Test
    public void TestFebonacciOf45(){
        int actualFeb45 = 1134903170;
        int expectedFeb45 = myFebonacci.fib(45);
        assertEquals(actualFeb45, expectedFeb45);
    }
    */
}