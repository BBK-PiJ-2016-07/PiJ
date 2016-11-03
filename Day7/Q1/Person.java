public class Person{
    private String name;
    private Person nextPerson;

    public Person(String personsName){
        this.name = personsName;
    }

    public String getName(){
          return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Person getNextPerson(){
          return nextPerson;
    }

    public void setNextPerson(Person nextPerson){
        this.nextPerson = nextPerson;
    }

}
