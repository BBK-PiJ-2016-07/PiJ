public class HospitalManager{
Patient firstPatient;
Patient current;

// Adding new Patient
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
// Printing patient method
public void print(){
      Patient current = firstPatient;
      System.out.println("Hospital Patients");
      while (current != null){
          System.out.println(current.print());
          current = current.getNextPatient();
      }
}

public void listSize(Patient newPatient)
{
      if(firstPatient == null) //checking is first Patient poiner is null/empty
      {
          firstPatient = newPatient;
          return;
      }
      int listSize = 0;
      Patient current = this.firstPatient;
      while(current != null)
      {
          listSize++;
          current = current.getNextPatient();
      }
  System.out.println("List size is: " + listSize);
}
}
