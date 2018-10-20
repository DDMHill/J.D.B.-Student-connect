package jd_brown_ycp.io;
import java.util.Scanner;
/**
 * @author hillm
 */
public class Database {
    Scanner input = new Scanner(System.in);
    Student student = new Student();
    public void addRecord(String name,String major,boolean availablity,int ID,int age){
        //STANDARD METHOD WITH ALL FIELDS
        student.setName(name);
        student.setMajor(major);
        student.setAvailablity(availablity);
        student.setID(ID);
        student.setAge(age);               
    }
    public void addRecord(){
        int field = 0;
        field = selectionMenu();
        if(field == 1)
            
        
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
