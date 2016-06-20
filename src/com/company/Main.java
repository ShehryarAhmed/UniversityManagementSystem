package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        University university = new University();
        Teacher teacher = new Teacher();
        Student student = new Student();
        while (true) {
            System.out.println("\n\n\n");
            System.out.println("\t\t1. Add Teacher");
            System.out.println("\t\t2. Add Student");
            System.out.println("\t\t3. Search Teacher");
            System.out.println("\t\t4. Search Student");
            System.out.println("\t\t5. Modify Teacher");
            System.out.println("\t\t6. Modify Student");
            System.out.println("\t\t7. Delete Teacher");
            System.out.println("\t\t8. Delete Student");
            System.out.println("\t\t9. Show All Teacher");
            System.out.println("\t\t10.Show All Student");
            System.out.println("\t\t11.Quit");
            System.out.println("\t\t   Select : ");
            int select = getval.nextInt();
            switch (select) {
                case 1: {
                    System.out.println("\t\t Add Teacher");
                    university.addTeacher(teacher);

                }
                break;

                case 2: {
                    System.out.println("\t\t Add Student");
                    university.addstudent(student);
                }
                break;
                case 3: {
                    if(university.indext > 0) {

                        System.out.println("\t\t Search Teacher");
                    System.out.println("Enter ID :");
                    int id = getval.nextInt();
                    university.searchTeacher(id);
                }else
                    {
                        System.out.println("Empty...");
                    }

                }
                break;
                case 4: {
                    if(university.indexs > 0) {

                        System.out.println("\t\t Search Student");
                        System.out.println("Enter Roll Number : ");
                        int roll = getval.nextInt();
                        university.searchStudent(roll);
                    }
                    else
                    {
                        System.out.println("Empty..");
                    }
                }
                break;
                case 5: {

                    if(university.indext > 0) {
                        System.out.println("\t\t Modify Teacher");
                        System.out.println("Enter Id :");
                        int id = getval.nextInt();
                        university.modifyTeacher(id);
                    }
                    else
                    {
                        System.out.println("Empty...");
                    }
                }
                break;
                case 6: {
                    if(university.indexs > 0) {

                    System.out.println("\t\t Modify Student");
                        System.out.println("Enter Roll#:");
                        int roll = getval.nextInt();
                        university.modifyStudent(roll);

                }else
                    {
                        System.out.println("Empty..");
                    }
                }
                break;
                case 7: {
                    System.out.println("\t\t Delete Teacher");
                    System.out.println("Enter Id :");
                    int id = getval.nextInt();
                    university.deleteTeacher(id);

                }
                break;
                case 8: {
                    System.out.println("\t\t Delete Student");
                    System.out.println("Enter Roll :");
                    int roll = getval.nextInt();
                    university.deleteStudent(roll);
                }
                break;
                case 9: {
                    System.out.println("\t\t Show All Teacher");
                    university.showALLTeacher();
                }
                break;
                case 10: {
                    System.out.println("\t\t Show All Student");
                    university.showALLStudent();

                }
                break;
                case 11: {
                    return;
                }

            }
        }
    }
}