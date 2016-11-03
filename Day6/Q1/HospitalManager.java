public class HospitalManager{
Patient firstPatient;
Patient current;

// Adding new Patient to a Signly Linked List
public void addPatient(Patient newPatient)
{
      if(firstPatient == null) //checking is first Patient poiner is null/empty
      {
          firstPatient = newPatient;
          return;
      }

      Patient current = this.firstPatient;
      while(current.getNextPatient() != null)
      {
          current = current.getNextPatient();
      }
  current.setNextPatient(newPatient);

}


// Printing patient method from Linked List
public void print(){
      Patient current = firstPatient;
      System.out.println("Hospital Patients");
      while (current != null){
          System.out.println(current.print());
          current = current.getNextPatient();
      }
}

}
