/**
* Java - Day 6, Exercise 3
* Doubley Linked List - where each element is connected with the next and previous elements
* In this exersice adding new elements to list, print all elements in forwards order, then backward order then deleting any elements
*/

public class Launcher{
private Patient firstPatient = null;

public static void main(String[] args){
    Launcher newLauncher = new Launcher();
    newLauncher.Launch();
}

private void Launch(){
    HospitalManager myHospital = new HospitalManager();
    System.out.println("Hosptial Open in the Morning.");
    System.out.println("");
    myHospital.printPatientListForward();
    System.out.println("");

    Patient yetAnotherPatient = new Patient("Mary", 34, "Meningitis");
    myHospital.addPatient(yetAnotherPatient);
    yetAnotherPatient = new Patient("Bob", 46, "Flu");
    myHospital.addPatient(yetAnotherPatient);
    yetAnotherPatient = new Patient("Duke", 86, "Fever");
    myHospital.addPatient(yetAnotherPatient);
    yetAnotherPatient = new Patient("Jack", 43, "Leg Broken");
    myHospital.addPatient(yetAnotherPatient);

    System.out.println("Printing forward list");
    myHospital.printPatientListForward();

    System.out.println("");
    System.out.println("Printing backward list");
    myHospital.printPatientListBackward();

    myHospital.releasePatient();



    //Printing Size of Linked List


}
}
