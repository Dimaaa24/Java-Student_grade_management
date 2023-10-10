package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {

    public static void menu()
    {
        System.out.println("\t\t=VEHICLE REGISTRY SYSTEM=");
        System.out.println("\t\t===========MENU==========\n");
        System.out.println("\t\t1.ADD");
        System.out.println("\t\t2.REMOVE");
        System.out.println("\t\t3.SEARCH");
        System.out.println("\t\t4.DISPLAY");
        System.out.println("\t\t5.EXIT");
    }
    public static void main(String[] args)
    {
        Set<Vehicle> vehicles=new HashSet<Vehicle>();
        Scanner cin=new Scanner(System.in);
        int choice;
        menu();
        choice=cin.nextInt();
        String VIN,make,model,license;
        int year;
        while(true)
        {
            switch(choice)
            {
                case 1:
                        System.out.println("Input a VIN:");
                        VIN=cin.next();
                        System.out.println("Input a make:");
                        make=cin.next();
                        System.out.println("Input a model:");
                        model=cin.next();
                        System.out.println("Input a license:");
                        license=cin.next();
                        System.out.println("Input a year:");
                        year= cin.nextInt();
                        Vehicle car=new Vehicle(VIN,license,make,model,year);
                        vehicles.add(car);
                    break;
                case 2:
                    System.out.println("Input a VIN to delete:");
                    VIN=cin.next();
                    for(Vehicle i:vehicles)
                    {
                        if(i.getVIN().equals(VIN))
                            vehicles.remove(i);
                    }
                    System.out.println("If found,the vehicles was removed!");
                    break;
                case 3:
                    System.out.println("Search for VIN:");
                    VIN= cin.next();
                    boolean ok=false;
                    for(Vehicle i:vehicles)
                    {
                        if(i.getVIN().equals(VIN))
                        {
                            System.out.println(i);
                            ok=true;
                            break;
                        }
                    }
                    if(ok==false)
                        System.out.println("Vehicle not in list!");
                    break;
                case 4:
                    System.out.println(vehicles);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input!");
            }
            menu();
            choice=cin.nextInt();
        }
    }
}
