/**
* Java - Day 6, Exercise 3
* Signly Linked List - Find the size of Singly Linked List
*/


public class Launcher{
private Patient firstPatient = null;

public static void main(String[] args){
    Launcher newLauncher = new Launcher();
    newLauncher.Launch();
}

private void Launch(){
    HospitalManager myHospital = new HospitalManager();

    Patient yetAnotherPatient = new Patient("Mary", 34, "Meningitis");
    myHospital.addPatient(yetAnotherPatient);
    yetAnotherPatient = new Patient("Bob", 46, "Flu");
    myHospital.addPatient(yetAnotherPatient);
    yetAnotherPatient = new Patient("Duke", 86, "Fever");
    myHospital.addPatient(yetAnotherPatient);
    yetAnotherPatient = new Patient("Jack", 43, "Leg Broken");
    myHospital.addPatient(yetAnotherPatient);
    myHospital.print();

    //Printing Size of Linked List
    myHospital.listSize(yetAnotherPatient);


}
}
