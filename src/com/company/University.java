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
        System.out.println("Contact # : ");
        String cnt = getval.next();
        s.setContact(cnt);
        student[indexs++] = s;

    }
    public void searchTeacher(int id){
        boolean find = false;
        for(int i =0 ; i < indext; i++) {
            if ( teacher[i].getId() == id) {
                System.out.println(teacher[i].getName() +" "+teacher[i].getAge() +" "+ teacher[i].getExperience()+" " + teacher[i].getCourse() +" "+ teacher[i].getContact());
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
        for(int i =0 ; i < student.length; i++){
            if(rollnum == student[i].rollnum){
                System.out.println(student[i]);
                find = true;
                break;
            }}
            if(find == false){
                System.out.println("Not Found...");
            }

    }
    public void showallteach(){
        if(indext > 0){
        for(int i = 0; i<indext; i++){
                System.out.println(teacher[i].getName());

        }

        }
        else {
            System.out.println("Empty List..");
        }
    }

}
