public class personQueueWithOnePointer implements PersonQueue{
    private Person tailOfQueue = null; //initilizing last element of the queue -

    public void insert(Person person){
        if(this.tailOfQueue == null){
            this.tailOfQueue = person;
            return; //Do nothing
        }

        person.setNextPerson(this.tailOfQueue);
        this.tailOfQueue = person;
        }


    public Person retrive(){
        if(this.tailOfQueue == null){
          return null;
        }
        if(tailOfQueue.getNextPerson() == null){
            Person result = this.tailOfQueue;
            this.tailOfQueue = null;
            return result;
        }
        Person currentPosition = this.tailOfQueue;
        while(currentPosition.getNextPerson() != null){
            currentPosition = currentPosition.getNextPerson();
        }
        Person result = currentPosition.getNextPerson();
        currentPosition.setNextPerson(null);
        return result;

      }

}
