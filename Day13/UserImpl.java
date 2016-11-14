public class UserImpl implements User {
    private String userName;
    private int userID;

    public UserImpl(String name) {
        this.userName = name;
        userID = -1;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID(){
        return userID;
    }

    public void register(MockLibrary mock) {
        userID = mock.getLibraryID();
    }

    public String getLibrary() {
        MockLibrary mock = new MockLibrary();
        return mock.getLibraryName();
    }
  

}