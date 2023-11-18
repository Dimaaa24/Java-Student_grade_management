package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void menu()
    {
        System.out.println("\t\t STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("\t\t ==============MENU=============\n");
        System.out.println("\t\t 1.ADD STUDENT");
        System.out.println("\t\t 2.REMOVE STUDENT");
        System.out.println("\t\t 3.UPDATE STUDENT INFO");
        System.out.println("\t\t 4.AVERAGE OF A STUDENT");
        System.out.println("\t\t 5.DISPLAY STUDENTS");
        System.out.println("\t\t E.EXIT");
        System.out.println("TESTEST");

        int a;
    }
    public static void main(String[] args)

    {
        List<Student> students=new ArrayList<Student>();
        Scanner cin=new Scanner(System.in);
        menu();
        String choice=cin.next();
        int ID;
        String name;
        while(true)
        {
            switch (choice) {
                case "1":
                    System.out.println("Input ID:");
                    ID = cin.nextInt();
                    System.out.println("Input Name:");
                    name = cin.next();
                    Student stud = new Student(ID, name);
                    System.out.println("Would you like to add marks?(Y/N)");
                    String choice2=cin.next();
                    if((choice2.equals("y"))||(choice2.equals("Y")))
                    {
                        System.out.println("How many marks?");
                        int j=cin.nextInt();
                        for(int k=0;k<j;k++)
                        {
                            System.out.println("Input mark:");
                            int mark = cin.nextInt();
                            System.out.println("Input the subject:");
                            String subject = cin.next();
                            stud.inputMark(mark, subject);
                            students.add(stud);
                        }
                    }
                    else
                    if((choice2.equals("n"))||(choice2.equals("N")))
                    students.add(stud);
                    else
                        System.out.println("WRONG CHOICE!");
                    break;
                case "2":
                    System.out.println("Input removal ID:");
                    int modID = cin.nextInt();
                    int ct=0;
                    for(Student i : students)
                    {
                        if (i.getID() == modID)
                            break;
                        ct++;
                    }
                    students.remove(ct);
                    break;
                case "3":
                    System.out.println("Choose an ID of the student you want to modify:");
                    modID = cin.nextInt();
                    System.out.println("Input new ID:");
                    ID = cin.nextInt();
                    System.out.println("Input new Name:");
                    name = cin.next();
                    ct=0;
                    for (Student i : students)
                    {
                        if (i.getID() == modID)
                            break;
                        ct++;
                    }
                    students.get(ct).setID(ID);
                    students.get(ct).setName(name);
                    break;
                case "4":
                    System.out.println("Choose an ID of the student you want to get average:");
                    modID = cin.nextInt();
                    ct=0;
                    System.out.println("Student's " + modID + " marks:");
                    for (Student i : students)
                    {
                        if (i.getID() == modID)
                            break;
                        ct++;
                    }
                    students.get(ct).displayMarks();
                    System.out.printf("The average is:%.2f\n",students.get(ct).getAverage());
                    break;
                case "5":
                    for (Student i : students) {
                        System.out.println(i);
                        i.displayMarks();
                        System.out.println("\n");
                    }
                    break;
                case "E":
                    System.exit(0);
                    break;
                default:
                    System.out.println("WRONG INPUT!");
            }
            menu();
            choice=cin.next();
        }
    }
}
