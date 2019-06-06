package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ch.makery.address.util.LocalDateAdapter;


public class Person {

    private final StringProperty name;
    private final StringProperty regDate;
    private final StringProperty street;
    private final IntegerProperty number; 
    private final ObjectProperty<LocalDate> birthday;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String regDate) {
        this.name = new SimpleStringProperty(firstName);
        this.regDate = new SimpleStringProperty(regDate);

        // Some initial dummy data, just for convenient testing.
        this.street = new SimpleStringProperty();
        this.number = new SimpleIntegerProperty();
       
        this.birthday = new SimpleObjectProperty<LocalDate>();
    }

    public String getFirstName() {
        return name.get();
    }

    public void setFirstName(String firstName) {
        this.name.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return name;
    }

    public String getLastName() {
        return regDate.get();
    }

    public void setLastName(String lastName) {
        this.regDate.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return regDate;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }

    public int getPostalCode() {
        return number.get();
    }

    public void setPostalCode(int postalCode) {
        this.number.set(postalCode);
    }

    public IntegerProperty postalCodeProperty() {
        return number;
    }

    

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}