package com.company;

/**
 * Created by apple on 19-Jun-16.
 */
public class Student extends Human{
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    @Override
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    @Override
    public void setState(String state) {
        this.State = state;
    }

    @Override
    public String getState() {
        return State;
    }

    @Override
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    @Override
    public String getContact() {
        return Contact;
    }

    int rollnum;
    String lasteducation;


    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }



    public String getLasteducation() {
        return lasteducation;
    }

    public void setLasteducation(String lasteducation) {
        this.lasteducation = lasteducation;
    }




}
