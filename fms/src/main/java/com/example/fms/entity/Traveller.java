package com.example.fms.entity;

import javax.persistence.*;

@Entity
public class Traveller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String travellerId;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private String contactNo;

    @ManyToOne
    @JoinColumn(name = "id")
    private Reservation reservation;


    public Traveller(String firstName, String lastName, String gender, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public Traveller() {
    }

    public String getTravellerId() {
        return travellerId;
    }

    public void setTravellerId(String travellerId) {
        this.travellerId = travellerId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
