package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@SuppressWarnings("unused")
public class advisior
{
    @Column
    @Id
    @GeneratedValue()
    Long advisorId;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String Address;
    @Column
    int phone;
    @Column
    String email;

    public advisior( String firstName, String lastName, String address, int phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        Address = address;
        this.phone = phone;
        this.email = email;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
