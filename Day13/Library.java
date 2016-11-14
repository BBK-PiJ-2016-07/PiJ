 /**
 * Library
 */
public interface Library {
    
    public String getLibraryName();

    public int getLibraryID();

    public int getMaxBooksPerUser();

    public void setMaxBooksPerUser(int numberOfBooks);
}