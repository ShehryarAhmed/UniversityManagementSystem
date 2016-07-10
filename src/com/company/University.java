package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by apple on 19-Jun-16.
 */
public class University {
    Teacher t;
    Student s;
    Teacher teacher[] = new Teacher[10];
    Student student[] = new Student[10];
    int teacherIndex = 0;
    int studentIndex = 0;
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
    

    private void initializeTeacher(){
        t = new Teacher();
        t.setName("Sir Zeeshan");
        t.setAge(29);
        t.setContact("012345");
        t.setCourse("java");
        t.setId(1);
        t.setExperience("TenYear");
        saveTeacher(t);

        t.setId(2);
        t = new Teacher();
        t.setName("Aziz Bhae");
        t.setAge(23);
        t.setContact("012345");
        t.setCourse("java");
        t.setExperience("oneYear");
        saveTeacher(t);

    }
    private void initializeStudent(){
        s = new Student();
        s.setName("Ali");
        s.setAge(20);
        s.setContact("012345");
        s.setLasteducation("Inter");
        s.setRollnum(1);
        saveStudent(s);

        s = new Student();
        s.setName("Shehryar");
        s.setAge(20);
        s.setContact("012345");
        s.setLasteducation("Inter");
        s.setRollnum(2);
        saveStudent(s);
    }

    public  void addTeacher(){
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

        saveTeacher(t);

    }

    private void saveTeacher(Teacher t) {
        teacher[teacherIndex++] = t;
    }
    private void saveStudent(Student s) { student[studentIndex++] = s;}
    private void specificTeacher(int i){
        System.out.println("Name : " + teacher[i].getName() +
                " \nAge : "+teacher[i].getAge() +"\nExperience : "+ teacher[i].getExperience()+
                "\nCourse :" + teacher[i].getCourse() +"\nContact# : "+ teacher[i].getContact());
    }
    private void SpecificStudent(int i){
        System.out.println("Name : " + student[i].getName() +
                "\nAge : " + student[i].getAge() + "\nRoll# : "+student[i].getRollnum() +
                "\nLast Education : " + student[i].getLasteducation()+ "\nContact : " + student[i].getContact());
    }
    private void addstudent(){
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
        saveStudent(s);

    }


    private int findTeacher(int index) {
        boolean finds = false;
        for ( int i = 0; i < teacherIndex; i++) {
            if (teacher[i] != null && index == teacher[i].getId()) {
               finds = true;
            return i;}}
    return -1;
    }

    private void searchTeacher(int id){
        int get = findTeacher(id);
        if(get!=-1) {
            specificTeacher(get);
        }
        else {
            System.out.println("Not Found...");
        }
    }
private int findStudent(int rollnum){
    boolean find = false;
    for(int i = 0; i < studentIndex; i++) {
        if (student[i] != null && rollnum == student[i].getRollnum()) {
            find = true;
            return i;
        }
    }
   return -1;}
    public void searchStudent(int rollnum){
        int get = findStudent(rollnum);
        if(get!=-1){
            SpecificStudent(get);
              }
        else {
            System.out.println("Not Found...");
        }

    }
    public void showALLTeacher(){
            System.out.println("\t ID NAME \t AGE \t EXPERIENCE \t COURSE \t CONTACT");
        for(int i = 0; i< teacherIndex; i++){
              if(teacher[i] != null){
                System.out.println("\t "+teacher[i].getId()+"\t"+teacher[i].getName()+" \t"+teacher[i].getAge()+" \t"+teacher[i].getExperience()+"\t"+
                        teacher[i].getCourse()+"\t"+teacher[i].getContact());

        }}
        }


    public void showALLStudent(){
            System.out.println("\t NAME \t AGE \t ROLL# \t LAST EDU \t CONTACT");
            for(int i = 0; i< studentIndex; i++){
                if(student[i] != null) {
                    System.out.println("\t " + student[i].getName() + "\t" + student[i].getAge() + " \t" + student[i].getRollnum() + " \t" + student[i].getLasteducation() + "\t" +
                            student[i].getContact());
                }
            }
        }


    public void deleteTeacher(int id){
        int get = findTeacher(id);
 if(get!=-1) {
     specificTeacher(get);
     System.out.println("Are Sure To Delte y/n : ");
     String choice = getval.next();
     if (choice.equalsIgnoreCase("y")) {
         teacher[get] = null;

     }
 }
 else {
     System.out.println("Not Fonud");

            }
        }

    public void deleteStudent(int rollnum){
        int get = findStudent(rollnum);
        if(get!=-1){
            SpecificStudent(get);
            System.out.println("Are Sure To Delte y/n : ");
            String choice = getval.next();
            if (choice.equalsIgnoreCase("y")) {
                student[get] = null;
                        }

        }
        else {
            System.out.println("Not Found...");
        }}

    public void modifyTeacher(int id) {
     int get = findTeacher(id);
        if(get!=-1){
            specificTeacher(get);
        System.out.println("Are Sure To Modify y/n : ");
                String choice = getval.next();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.println("Experence : ");
                    String exp = getval.next();
                    teacher[get].setExperience(exp);
                    System.out.println("Course : ");
                    String cur = getval.next();
                    teacher[get].setCourse(cur);
                    System.out.println("Contact# : ");
                    String cnt = getval.next();
                    teacher[get].setContact(cnt);
                }}
        else
        {
            System.out.println("Not Found...");
        }}
    public void modifyStudent(int rollnum) {
       int get = findStudent(rollnum);
        if(get!=-1){
            SpecificStudent(get);
            System.out.println("Are Sure To Modify y/n : ");
                String choice = getval.next();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.println("Last Educaton : ");
                    String ledu = getval.next();
                    student[get].setLasteducation(ledu);
                    System.out.println("Contact : ");
                    String cnt = getval.next();
                    student[get].setContact(cnt);
                }}
        else {
            System.out.println("Not Found...");
        }}


    public void menu() {
        initializeTeacher();
        initializeStudent();
        while (true) {
            System.out.println("\n1.Teacher\n2.Student\n3.Quit");
            System.out.println("Select : ");
            int select = getval.nextInt();
            switch (select) {
                case 1: {
                    System.out.println("Teacher");
                    boolean pause = false;
                    do {
                        System.out.println("1. Add Teacher\n2. Search Teacher\n3. Modify Teacher\n4. " +
                                "Delete Teacher\n5. Show All Teacher\n6. Main Menu");
                        System.out.println("Select : ");
                        int choice = getval.nextInt();
                        switch (choice) {
                            case 1: {
                                addTeacher();
                            }
                            break;
                            case 2: {
                                if (teacherIndex > 0) {
                                    System.out.println("Search Teacher");
                                    System.out.println("Enter ID :");
                                    int id = getval.nextInt();
                                    searchTeacher(id);
                                } else {
                                    System.out.println("Empty...");
                                }
                            }
                            break;
                            case 3: {
                                if (teacherIndex > 0) {
                                    System.out.println(" Modify Teacher");
                                    System.out.println("Enter Id :");
                                    int id = getval.nextInt();
                                    modifyTeacher(id);
                                } else {
                                    System.out.println("Empty...");
                                }
                            }
                            break;
                            case 4: {
                                if (teacherIndex > 0) {
                                    System.out.println("Delete Teacher");
                                    System.out.println("Enter Id :");
                                    int id = getval.nextInt();
                                    deleteTeacher(id);
                                } else {
                                    System.out.println("Empty...");
                                }
                            }
                            break;
                            case 5: {
                                if (teacherIndex > 0) {
                                    System.out.println("\t\t Show All Teacher");
                                    showALLTeacher();
                                } else {
                                    System.out.println("Empty...");
                                }
                            }
                            break;
                            case 6: {
                                System.out.println("Back To Main Menu");
                                pause = true;
                            }
                            break;
                            default: {
                                System.out.println("Wrong Selected..\n Select 1,2,3,4,5,6");
                            }
                        }

                    }while (pause == false);
                }break;
                 case 2: {
                        System.out.println(" Student");
                        boolean pause = false;
                        do {
                        System.out.println("1. Add Student\n2. Search Student\n3. Modify Student\n4. " +
                        "Delete Student\n5. Show All Student\n6.Main Menu");

                            System.out.println("Select : ");
                            int choice = getval.nextInt();
                            switch (choice) {
                                case 1: {
                                    addstudent();
                                }
                                break;
                                case 2: {
                                    if (studentIndex > 0) {
                                        System.out.println("Search Student");
                                        System.out.println("Enter Roll No :");
                                        int id = getval.nextInt();
                                        searchStudent(id);
                                    } else {
                                        System.out.println("Empty...");
                                    }
                                }
                                break;
                                case 3: {
                                    if (studentIndex > 0) {
                                        System.out.println(" Modify Student");
                                        System.out.println("Enter Roll No :");
                                        int id = getval.nextInt();
                                        modifyStudent(id);
                                    } else {
                                        System.out.println("Empty...");
                                    }
                                }
                                break;
                                case 4: {
                                    if (studentIndex > 0) {
                                        System.out.println("Delete Student");
                                        System.out.println("Enter Roll No: :");
                                        int id = getval.nextInt();
                                        deleteStudent(id);
                                    } else {
                                        System.out.println("Empty...");
                                    }
                                }
                                break;
                                case 5: {
                                    if (studentIndex > 0) {
                                        System.out.println("\t\t Show All Student");
                                        showALLStudent();
                                    } else {
                                        System.out.println("Empty...");
                                    }
                                }
                                break;
                                case 6: {
                                    System.out.println("Back To Main Menu");
                                     pause = true;
                                }
                                break;
                                default: {
                                    System.out.println("Wrong Selected..\n" +
                                            " Select 1,2,3,4,5,6");
                                }
                                break;
                            }
                        }
                        while (pause==false);
                    }
                    break;
                    case 3:{
                        return;
                }
                    default:{
                        System.out.println("Wrong Selected..\n" +
                                " Select 1,2,3");
                    }
            }}}}