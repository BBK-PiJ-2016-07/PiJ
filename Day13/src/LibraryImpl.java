public class LibraryImpl implements Library {
    private String libraryName;
    private int libraryID;
    private int maxBooksPerUser;

    public LibraryImpl(String libraryName, int libraryID, int maxBooksPerUser) {
        this.libraryName = libraryName;
        this.libraryID = libraryID;
        this.maxBooksPerUser = maxBooksPerUser;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public int getLibraryID() {
        return libraryID;
    }

    public int getMaxBooksPerUser() {
        return maxBooksPerUser;
    }

    public void setMaxBooksPerUser(int numberOfBooks) {
        maxBooksPerUser = numberOfBooks;
    }
}