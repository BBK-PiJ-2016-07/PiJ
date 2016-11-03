public class Calculator{
    private int numberOne = 0;
    private int numberTwo = 0;

    public Calculator(int numOne, int numTwo)
    {
      this.numberOne = numOne;
      this.numberTwo = numTwo;
    }

    public int add(int numberOne, int numberTwo)
    {
        return numberOne + numberTwo;
    }

    public int subtract(int numberOne, int numberTwo)
    {
        return numberOne - numberTwo;
    }

    public int sum(int numberOne, int numberTwo)
    {
        return numberOne + numberTwo;
    }

    public int divide(int numberOne, int numberTwo)
    {
        return numberOne / numberTwo;
    }

}
