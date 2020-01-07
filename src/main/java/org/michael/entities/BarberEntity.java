package org.michael.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BarberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int barberId;

    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;

    @OneToMany(mappedBy = "barber")
    private List<BookingEntity> bookingEntities = new ArrayList<>();


    public BarberEntity() {
    }

    public int getBarberId() {
        return barberId;
    }

    public void setBarberId(int barberId) {
        this.barberId = barberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }



}
