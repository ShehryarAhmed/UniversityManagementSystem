package com.company;

/**
 * Created by pc on 7/7/2016.
 */
public abstract class Human {
    String name;
    int age;
    String DateOfBirth;
    String address;
    String State;
    String Contact;


    public abstract String getName();
    public abstract void setName(String name);

    public abstract int getAge();
    public abstract void setAge(int age) ;

    public abstract String getDateOfBirth();
    public abstract void setDateOfBirth(String dateOfBirth);

    public abstract String getAddress();
    public abstract void setAddress(String address);

    public abstract String getState() ;
    public abstract void setState(String state) ;

    public abstract String getContact() ;
    public abstract void setContact(String Contact) ;


}
