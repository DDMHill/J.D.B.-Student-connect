
package jd_brown_ycp.io;

/**
 *
 * @author hillm
 */
public class Student {
    protected
            String name;
            String major;
            String specialty;//KEYWORD PROGRAM LANG
            int age;
            int ID;//STUDENT ID MADE FROM HASH
            boolean availablity;


    protected void setSpecialty(String specialty) {
        this.specialty = specialty;
    }            
    
    protected void setMajor(String major) {
        this.major = major;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public void setID(int id) {
        this.ID = id;
    }

    protected void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }
    protected void setName(String name){
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected String getMajor() {
        return major;
    }

    protected int getAge() {
        return age;
    }

    protected int getID() {
        return ID;
    }
    protected String getSpecialty() {
        return specialty;
    }

    protected boolean isAvailablity() {
        return availablity;
    }
     @Override
    public String toString(){
        return this.name + "->" + this.major + "->" + this.id + "->" + this.availablity + "->" + this.specialty;
    }
    
}
