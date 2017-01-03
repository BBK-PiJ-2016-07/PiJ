import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Iterative: " + factorialIterative(25));
        System.out.println("Rescursive: " + factorialRecursive(25));
        System.out.println("Streamwise: " + factorialSteam(25));
    }
    public static long factorialIterative(int number){
        long product = 1;
        for(int i = 2; i <= number; i++){
            product *= i;
        }
        return  product;
    }

    public static long factorialRecursive(int number){
        return (1 > number) ? 1 : number * factorialRecursive(number - 1);
    }

    public static long factorialSteam(int number){
        return LongStream.rangeClosed(2, number).reduce(1, (a,b) -> a * b);
    }
}
