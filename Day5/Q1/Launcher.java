public class Launcher{

  public static void main(String[] args){

      Calculator calc = new Calculator(2,2);

      int result = calc.add(2,2);
      System.out.println("Addition will be: " + result);
      result = calc.subtract(2,2);
      System.out.println("Subtraction will be: " + result);
      result = calc.sum(2,2);
      System.out.println("Sum will be: " + result);
      result = calc.divide(2,2);
      System.out.println("Division will be: " + result);




}
}
