public interface User {

    /*
     *returns the String for the user's name
     */
     public String getUserName();

    /*
     *@returns the int value of the user ID
     */
    public int getUserID();

    /*
     * New User registaration
    */
    public void register(MockLibrary mock);

    public String getLibrary();
    
}