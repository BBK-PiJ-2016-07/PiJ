/**
* Java - Day 6, Exercise 1
* Signly Linked List - Impletmentation of Hospital/Patient Data
*/

public class Launcher{
private Patient firstPatient = null;

public static void main(String[] args){
    Launcher newLauncher = new Launcher();
    newLauncher.Launch();
}

private void Launch(){
    HospitalManager myHospital = new HospitalManager();
    Patient yetAnotherPatient = new Patient("Mary", 66, "Meningitis");
    myHospital.addPatient(yetAnotherPatient);
    myHospital.print();
    yetAnotherPatient = new Patient("Bob", 46, "Flu");
    myHospital.addPatient(yetAnotherPatient);
    myHospital.print();
    yetAnotherPatient = new Patient("Duke", 86, "Fever");
    myHospital.addPatient(yetAnotherPatient);
    myHospital.print();
    yetAnotherPatient = new Patient("Jack", 43, "Leg Broken");
    myHospital.addPatient(yetAnotherPatient);
    myHospital.print();

}
}
