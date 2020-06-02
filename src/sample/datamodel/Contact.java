package sample.datamodel;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty phoneNumber;
    private SimpleStringProperty notes;

    public Contact(String fName, String lName, String pNumber, String skrivelser) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.phoneNumber = new SimpleStringProperty(pNumber);
        this.notes = new SimpleStringProperty(skrivelser);
    }

    public Contact() {
        this.firstName = new SimpleStringProperty("fName");
        this.lastName = new SimpleStringProperty("lName");
        this.phoneNumber = new SimpleStringProperty("pNumber");
        this.notes = new SimpleStringProperty("skrivelser");
    }

//    public Contact() {
//        this.firstName = null;
//        this.lastName = null;
//        this.phoneNumber = null;
//        this.notes = null;
//    }


    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        this.firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lName) {
        this.lastName.set(lName);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public void setPhoneNumber(String pNumber) {
        this.phoneNumber.set(pNumber);
    }

    public String getNotes() {
        return notes.get();
    }

    public void setNotes(String skrivelser) {
        this.notes.set(skrivelser);
    }

}
