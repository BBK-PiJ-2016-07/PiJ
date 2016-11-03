public class Patient{
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private Patient previousPatient;


// Patient class constructor
    public Patient(String name, int age, String illness){
          this.name = name;
          this.age = age;
          this.illness = illness;
          this.nextPatient = null;
          this.previousPatient = null;
    }

// Getters and Setters for Private variables in Patient class;
// These private fields are not visible to anyother class
// In order to access these private fileds getter are setter methods has been created

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getIllness(){
        return illness;
    }

    public void setIllness(String illness){
        this.illness = illness;
    }

//Getter and Setter for Patient
    public Patient getNextPatient(){
        return nextPatient;
    }
    public void setNextPatient(Patient nextPatient){
        this.nextPatient = nextPatient;
    }

//Getter and Setter for Previous Patient
    public Patient getPreviousPatient(){
        return previousPatient;
    }
    public void setPreviousPatient(Patient previousPatient){
        this.previousPatient = previousPatient;
    }

//Prining Patient Method
    public String print(){
          return "Name: " + getName() + " Age: " + getAge() + " Illness: " + getIllness();
    }
}
