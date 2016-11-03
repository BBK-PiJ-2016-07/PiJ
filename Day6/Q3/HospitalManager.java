public class HospitalManager{
Patient firstPatient = null;  //Head of Linked List

// Adding new Patient
public void addPatient(Patient newPatient)
{
      if(firstPatient == null)                              //checking is first pointer is null/ list is empty
      {
          firstPatient = newPatient;                        //assign 1st elements new patient
          return;
      }
      Patient currentPatient = this.firstPatient;           // Traversing assigning current as 1st patient as list is empty
      while(currentPatient.getNextPatient() != null)
      {
          currentPatient = currentPatient.getNextPatient(); //current pointing to last element pointing to null then
      }
      currentPatient.setNextPatient(newPatient);            // current.next = newPatient
      newPatient.setPreviousPatient(currentPatient);        // newPatient.previous = current
}

// Printing list of patient method - Forward Printing [First element to last]
public void printPatientListForward(){
      if(firstPatient == null){
          System.out.println("No Patient found !!! Empty List");
          return;
      }
      Patient currentPatient = firstPatient;

      while (currentPatient.getNextPatient() != null){
          System.out.println(currentPatient.print());
          currentPatient = currentPatient.getNextPatient();
      }
      System.out.println(currentPatient.print());
}

// Printing list of patient method - Backward [Last element to first]
public void printPatientListBackward(){
      if(firstPatient == null){
          System.out.println("No Patient found !!! Empty List");
          return;
      }

      Patient currentPatient = firstPatient;
      while (currentPatient.getNextPatient() != null){
          currentPatient = currentPatient.getNextPatient();
      }

      while(currentPatient.getNextPatient() != firstPatient){
          System.out.println(currentPatient.print());
          currentPatient = currentPatient.getPreviousPatient();
      }
      System.out.println(currentPatient.print());
}


// Releaseing Patient (Deleting from list) Method
public void releasePatient(){

}
}
