public class superMarket{
    private personQueueWithOnePointer queueA = new personQueueWithOnePointer();
    private personQueueWithOnePointer queueB = new personQueueWithOnePointer();

    public static void main(String[] args){
        Person customer1 = new Person("Bilal");
        Person customer2 = new Person("Ahmad");
        Person customer3 = new Person("John");
        Person customer4 = new Person("Mark");
        superMarket market = new superMarket();
        market.addPerson(customer1);
        market.addPerson(customer2);
        market.addPerson(customer3);
        market.servePerson();
        //market.addPerson(customer4);
        //market.servePerson();
        //market.servePerson();
        //market.servePerson();

    }


    public void addPerson(Person customer){
        queueA.insert(customer);
        System.out.println("Customer " + customer.getName() + " is queuing ...");
    }

    public void servePerson(){
        Person customerServed = queueA.retrive();
        System.out.println(customerServed.getName() + ": is happliy served");
    }

}
