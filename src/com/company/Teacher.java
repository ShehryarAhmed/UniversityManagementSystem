package com.company;

/**
 * Created by apple on 19-Jun-16.
 */
public class Teacher extends Human{
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
    String experience;
    String course;

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        this.Contact = contact;
    }



    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
