public class Method{
    public static void main(String[] args) {
        Method myMethod = new Method();
        System.out.println("Result checking..." + myMethod.doggyMethod(10));
    }

public String doggyMethod(int n) {
    String result = doggyMethod(n-3) + n + doggyMethod(n-2); 
    if (n <= 0) {
    return ""; 
    }
        return result;
    }

}