/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd_brown_ycp.io;
import java.lang.String;
import java.util.Scanner;
/**
 *
 * @author dhill
 */
public class Database {
//LOCAL VARIABLES:
    Student student = new Student();
    Scanner input = new Scanner(System.in);
    Specialty specialty;
//METHODS:
    public boolean modifyRecord(String Name){
        String modification_str;
        int modification_int;
        if(!find(Name)){
            return false;
        } else {
            while(true){
                int update = selectionMenu();
                switch (update) {
                    case 1:
                        System.out.print("Please enter name: ");
                        modification_str = input.nextLine();
                        student.setName(modification_str);
                        System.out.println(" ");
                        return true;
                    case 2:
                        System.out.print("Please enter major: ");
                        modification_str = input.nextLine();
                        student.setMajor(modification_str);
                        System.out.println(" ");
                        return true;
                    case 3:
                        boolean modification_bool;
                        boolean exit = false;
                        while(!exit){
                            System.out.print("Please enter availability: ");
                            modification_str = input.nextLine();
                            modification_str.toLowerCase();
                            if (modification_str == "true" && modification_str == "t"){
                                modification_bool = true;
                                exit = true;
                            } else if (modification_str == "false" && modification_str == "f"){
                                modification_bool = false;
                                exit = true;
                            } else {
                                System.out.println("Invalid input. Plase try again.");
                                exit = true;
                            }
                        }
                        student.setAvailablity(modification_str);
                        System.out.println(" ");
                        return true;
                    case 4:
                        System.out.print("Please enter id ");
                        modification_int = input.nextInt();
                        student.setID(modification_int);
                        System.out.println(" ");
                        return true;
                    case 5:
                        System.out.print("Please enter age: ");
                        modification_int = input.nextInt();
                        student.setAge(modification_int);
                        System.out.println(" ");
                        return true;
                    case 6:
                        System.out.print("Please enter Ability:");
                        modification_str = input.nextLine();
                        student.setSpecialty(modification_str);
                        System.out.println(" ");
                        return true;
                    default:
                        System.out.println("Invalid input.  Please try again");
                        break;
                }
            }
        }
    }
    
    private int selectionMenu(){
        int field = 0;
        System.out.println("Select field to add:\n1. Name\n2. Major\n3. Availablity\n4. ID\n5. Age\n6. Ability");
        field = input.nextInt();
        while(field > 6 || field < 1){
           System.out.println("Select field to add:\n1. Name\n2. Major\n3. Availablity\n4. ID\n5. Age\n6. Ability");
           field = input.nextInt();
        }            
        return field;
    }
}
public void addRecord(String name,String major,boolean availablity,int ID,int age){
        //STANDARD METHOD WITH ALL FIELDS
        student.setName(name);
        student.setMajor(major);
        student.setAvailablity(availablity);
        student.setID(ID);
        student.setAge(age);               
    }
//UTILITY MEHTODS:
    private int selectionMenu(){
        int field = 0;
        System.out.println("Select field to add:\n1. Name\n2. Major\n3. Availablity\n4. ID\n5. Age\n6. Ability");
        field = input.nextInt();
        while(field > 6 || field < 1){
           System.out.println("Select field to add:\n1. Name\n2. Major\n3. Availablity\n4. ID\n5. Age\n6. Ability");
           field = input.nextInt();
        }            
        return field;
    }
    private int majorMenu(){//NOT USED
        int field = 0;
        System.out.println("\n1. Science\n2. Technology\n3. Engineering\n4. Mathematics\n5. Business ");
        field = input.nextInt();
        while(field > 5 || field < 1){
            System.out.println("\n1. Science\n2. Technology\n3. Engineering\n4. Mathematics\n5. Business ");
            field = input.nextInt();
        }
        return field;
    }    
//OVERLOADED METHODS:
    public void addRecord(){
    //LOCAL VARIABLES:
        int field = 0;
        String line = "";
        boolean status = false;
        Student student = new Student();
        field = selectionMenu();
        while(field != 6){
            switch (field) {
                case 1:
                    System.out.println("\nENTER NAME: ");
                    line = input.next();
                    student.setName(line);
                    break;
                case 2:
                    line = input.next();
                    student.setMajor(line);
                    break;
                case 3:
                    System.out.println("\nENTER STUDENT'S STATUS: ");
                    status = input.nextBoolean();
                    student.setAvailablity(status);
                    break;
                case 4:
                    int id = 0;
                    System.out.println("\nENTER ID: ");
                    id = input.nextInt();
                    student.setID(id);
                    break;
                case 5:                  
                    System.out.println("\nENTER AGE: ");
                    id = input.nextInt();
                    student.setAge(id);
                    break;   
                
            }  
            field = selectionMenu();//BROKEN
        }
    }

}
