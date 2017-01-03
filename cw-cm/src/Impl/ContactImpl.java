

public class ContactImpl implements Contact{
    private int contactID;
    private String contactName;
    private String contactNote;



        public ContactImpl(int contactID,  String contactName){
            if(contactID <= 0){
                throw new IllegalArgumentException("Contact ID must be greater then Zero");
            }
            this.contactID = contactID;
            if(contactName == null){
                throw new NullPointerException("Contact name cannot be empty" + contactID);
            }
            this.contactName = contactName;
        }

        public ContactImpl(int contactID, String contactName, String contactNote){
            new ContactImpl(contactID, contactName);
            this.contactNote = contactNote;
        }

        public int getID(){
           return this.contactID;
        }

        public String getName(){
            return this.contactName;
        }

        public String getNotes(){
            return this.contactNote;
        }

        public void addNotes(String note){
            if(getNotes().equals(null)) {
                this.contactNote = note;
            }
            this.contactNote = note;
        }
}
