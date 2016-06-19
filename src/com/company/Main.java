package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        University university = new University();
        Teacher teacher = new Teacher();
        Student student = new Student();
        while (true) {
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
                    System.out.println("\t\t Search Teacher");
                    System.out.println("Enter ID :");
                    int id = getval.nextInt();
                    university.searchTeacher(id);
                }
                break;
                case 4: {
                    System.out.println("\t\t Search Student");
                    System.out.println("Enter Roll Number : ");
                    int roll = getval.nextInt();
                    university.searchStudent(roll);

                }
                break;
                case 5: {
                    System.out.println("\t\t Modify Teacher");

                }
                break;
                case 6: {
                    System.out.println("\t\t Modify Student");

                }
                break;
                case 7: {
                    System.out.println("\t\t Delete Teacher");

                }
                break;
                case 8: {
                    System.out.println("\t\t Delete Student");

                }
                break;
                case 9: {
                    System.out.println("\t\t Show All Teacher");
                    university.showallteach();
                }
                break;
                case 10: {
                    System.out.println("\t\t Show All Student");


                }
                break;
                case 11: {
                    return;
                }

            }
        }
    }
}