import java.util.ArrayList;
import java.util.List;

public class CatchException {
    
    public static void main(String[] args) {
        CatchException myException = new CatchException();
        myException.TestMethod();
    }
  
    public void TestMethod(){
        List<String> list = new ArrayList<String>();
            
        try {
            list.add("a");
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}