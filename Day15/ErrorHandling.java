import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ErrorHandling {
   
    public static void main(String[] args){
        ErrorHandling myInput = new ErrorHandling();
        int setNumberOfInputs = myInput.setUserInput();
        int inputCount = 0;
        int userInputs = 0;
        int userInputs1 = 0;
        System.out.println("Now Enter number between (0-9): ");
        while(inputCount < setNumberOfInputs){
            try{
                 userInputs += myInput.takeUserInput();
                 inputCount++;
            } catch(InputMismatchException ex){
                System.out.println("ERROR! wrong input! Enter only integer number: ");
            }
        }
        System.out.println("User Input is: " + userInputs);
        System.out.println("setNumberOfInputs " + setNumberOfInputs);
        

        double average = (double)userInputs/(double)setNumberOfInputs;
        System.out.println("Average of Numbers entered is : " + average);
        
    }
    public int setUserInput(){
        ErrorHandling myCheck = new ErrorHandling();
        System.out.println("How many Inputs you want to set? : ");
        int numberOfInputs = myCheck.takeUserInput();
        return numberOfInputs;
    }     
    
    public int takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
    /**
    * ------------------Exercise 3 Part A------------------------------------------------
    */
    /*public double CalculatingAverage(){
        System.out.println("Please 10 number between (0-9): ");
        Scanner scanner = new Scanner(System.in);
        int userInput;
        double average = 0;
        int checkInput = 0;
        while (checkInput < 10 ) {
            try {
                userInput = scanner.nextInt();
                average += userInput;
                checkInput++;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR! wrong input! Function only accept integers between(0-9)");
                scanner = new Scanner(System.in);
            }
        }
        return average / 10;
    }
    */



}