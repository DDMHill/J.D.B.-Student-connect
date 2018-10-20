package jd_brown_ycp.io;
import java.util.Scanner;
/**
 * @author hillm
 */
public class Database {
    Scanner input = new Scanner(System.in);
    
    public void addField(){
        int field = 0;
        //CLEAR SCREEN
        System.out.println("Select field to add:\n1. Name\n2. Major\n3. Availablity\n4. ID\n5. Age\n6. Ability");
        field = input.nextInt();
        
    }
    public void addRecord(String name,String major,boolean availablity,int ID,int age){
        
        
    }
    
    
}
