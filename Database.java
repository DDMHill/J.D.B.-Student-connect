package jd_brown_ycp.io;
import java.util.Scanner;
/**
 * @author hillm
 */
public class Database {
//LOCAL VARIABLES:    
    Scanner input = new Scanner(System.in);
    Student student = new Student();
    Specialty specialty;
//METHODS:
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
    }
    
    
}
