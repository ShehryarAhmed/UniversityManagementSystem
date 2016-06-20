package com.company;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by apple on 19-Jun-16.
 */
public class University {
    Teacher t;
    Student s;
    Teacher teacher[] = new Teacher[10];
    Student student[] = new Student[10];
    int indext = 0;
    int indexs = 0;
    Scanner getval = new Scanner(System.in);
//    public void addTeacher(){};
//    public void addStudent(){};
//    public void serachTeacher(){};
//    public void serachStudent(){};
//    public void listOfTeacher(){};
//    public void listOfStudent(){};
//    public void deleteTeacher(){};
//    public void deleteStudent(){};
//    public void modifyTeacher(){};
//    public void modifyStudent(){};
//    public void quit(){};

    public  void addTeacher(Teacher t ){
        t = new Teacher();
        System.out.println("Name : ");
        String name = getval.next();
        t.setName(name);
        System.out.println("Id : ");
        int id = getval.nextInt();
        t.setId(id);
        System.out.println("Age : ");
        int age = getval.nextInt();
        t.setAge(age);
        System.out.println("Experience  : ");
        String exp = getval.next();
        t.setExperience(exp);
        System.out.println("Course : ");
        String course = getval.next();
        t.setCourse(course);
        System.out.println("Contact # : ");
        String cnt = getval.next();
        t.setContact(cnt);
        teacher[indext++] = t;

    }
    public void addstudent(Student s){
        s= new Student();
        System.out.println("Name : ");
        String name = getval.next();
        s.setName(name);
        System.out.println("Age : ");
        int age = getval.nextInt();
        s.setAge(age);
        System.out.println("Last Education : ");
        String ledu = getval.next();
        s.setLasteducation(ledu);
        System.out.println("Roll# : ");
        int roll = getval.nextInt();
        s.setRollnum(roll);
        System.out.println("Contact # : ");
        String cnt = getval.next();
        s.setContact(cnt);
        student[indexs++] = s;

    }
    public void searchTeacher(int id){
        boolean find = false;
        for(int i =0 ; i < indext; i++) {
            if (teacher[i] != null && teacher[i].getId() == id) {
                System.out.println("Name : " + teacher[i].getName() +
                        " \nAge : "+teacher[i].getAge() +"\nExperience : "+ teacher[i].getExperience()+
                        "\nCourse :" + teacher[i].getCourse() +"\nContact# : "+ teacher[i].getContact());
                find = true;
                break;
            }
        }
        if(find == false && teacher.length != 0){
                System.out.println("Not Found...");
            }

        }

    public void searchStudent(int rollnum){
        boolean find = false;
        for(int i =0 ; i < indexs; i++){
            if(student[i] != null && rollnum == student[i].getRollnum()){
                System.out.println("Name : " + student[i].getName() +
                 "\nAge : " + student[i].getAge() + "\nRoll# : "+student[i].getRollnum() +
                "\nLast Education : " + student[i].getLasteducation()+ "\nContact : " + student[i].getContact());
                find = true;
                break;
            }}
            if(find == false && student.length != 0){
                System.out.println("Not Found...");
            }

    }
    public void showALLTeacher(){
        if(indext > 0 ){
            System.out.println("\t ID NAME \t AGE \t EXPERIENCE \t COURSE \t CONTACT");
        for(int i = 0; i<indext; i++){
              if(teacher[i] != null){
                System.out.println("\t "+teacher[i].getId()+"\t"+teacher[i].getName()+" \t"+teacher[i].getAge()+" \t"+teacher[i].getExperience()+"\t"+
                        teacher[i].getCourse()+"\t"+teacher[i].getContact());

        }}
        }
        else {
            System.out.println("Empty List..");
        }
    }
    public void showALLStudent(){
        if(indexs > 0){
            System.out.println("\t NAME \t AGE \t ROLL# \t LAST EDU \t CONTACT");
            for(int i = 0; i<indexs; i++){
                System.out.println("\t "+student[i].getName()+"\t"+student[i].getAge()+" \t"+student[i].getRollnum()+" \t"+student[i].getLasteducation()+"\t"+
                        student[i].getContact());

            }
        }
        else {
            System.out.println("Empty List..");
        }
    }
    public void deleteTeacher(int id){
        boolean find = false;
        int i = 0;
        for( i =0 ; i < indext; i++) {
            if ( teacher[i].getId() == id) {
                System.out.println("Name : " + teacher[i].getName() +
                        " \nAge : "+teacher[i].getAge() +"\nExperience : "+ teacher[i].getExperience()+
                        "\nCourse :" + teacher[i].getCourse() +"\nContact# : "+ teacher[i].getContact());
                find = true;
                break;

            }
        }
        if(find == false && teacher.length != 0){
            System.out.println("Not Found...");
        }
        else {
            System.out.println("Are Sure To Delte y/n : ");
            String choice = getval.next();
            if (choice.equalsIgnoreCase("y")) {
                teacher[i] = null;
                indext -= 1;
            }
            }
        }

    public void deleteStudent(int rollnum){
        boolean find = false;
        int i = 0;
        for( i =0 ; i <indexs; i++){
            if(rollnum == student[i].rollnum){
                System.out.println("Name : " + student[i].getName() +
                        "\nAge : " + student[i].getAge() + "\nRoll# : "+student[i].getRollnum() +
                        "\nLast Education : " + student[i].getLasteducation()+ "\nContact : " + student[i].getContact());
                find = true;
                break;
            }}
        if(find == false && student.length != 0){
            System.out.println("Not Found...");
        }
        else {
            System.out.println("Are Sure To Delte y/n : ");
            String choice = getval.next();
            if (choice.equalsIgnoreCase("y")) {
                student[i] = null;
                indexs -= 1;
            }
        }
    }

    public void modifyTeacher(int id) {
        boolean find = false;
        int i = 0;
        if(indext > 0) {
            for (i = 0; i < indext; i++) {
                if (teacher[i].getId() == id) {
                    System.out.println("Name : " + teacher[i].getName() +
                            " \nAge : " + teacher[i].getAge() + "\nExperience : " + teacher[i].getExperience() +
                            "\nCourse :" + teacher[i].getCourse() + "\nContact# : " + teacher[i].getContact());
                    find = true;
                    break;
                }}
            if (find == false && teacher.length != 0) {
                System.out.println("Not Found...");
            } else {
                System.out.println("Are Sure To Modify y/n : ");
                String choice = getval.next();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.println("Experence : ");
                    String exp = getval.next();
                    teacher[i].setExperience(exp);
                    System.out.println("Course : ");
                    String cur = getval.next();
                    teacher[i].setCourse(cur);
                    System.out.println("Contact# : ");
                    String cnt = getval.next();
                    teacher[i].setContact(cnt);
                }}}
        else
        {
            System.out.println("Empty..");
        }}
    public void modifyStudent(int rollnum) {
        boolean find = false;
        int i = 0;
        if (indexs > 0) {
            for (i = 0; i < indexs; i++) {
                if (rollnum == student[i].rollnum) {
                    System.out.println("Name : " + student[i].getName() +
                            "\nAge : " + student[i].getAge() + "\nRoll# : " + student[i].getRollnum() +
                            "\nLast Education : " + student[i].getLasteducation() + "\nContact : " + student[i].getContact());
                    find = true;
                    break;
                }
            }
            if (find == false && student.length != 0) {
                System.out.println("Not Found...");
            } else {
                System.out.println("Are Sure To Modify y/n : ");
                String choice = getval.next();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.println("Last Educaton : ");
                    String ledu = getval.next();
                    student[i].setLasteducation(ledu);
                    System.out.println("Contact : ");
                    String cnt = getval.next();
                    student[i].setContact(cnt);
                }
            }
        }
    }


}