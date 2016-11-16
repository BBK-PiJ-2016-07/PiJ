 /**
 * Mccarthys
 */
public class mccarthy {
    public static void main(String[] args) {
        mccarthy myMccarthys = new mccarthy();
        //System.out.println("Result new: " + myMccarthys.mcCarthy91(50));
        //System.out.println("Result new: " + myMccarthys.mcCarthy91(73));
        System.out.println("Result new: " + myMccarthys.mcCarthy91(95));
   
    }

    public int mcCarthy91(int n) { 
        System.out.println("New n is: " + n);
        if (n > 100) {
            return n - 1ckea0;
        } else {
            return mcCarthy91(mcCarthy91(n+11));
        }
    }
}