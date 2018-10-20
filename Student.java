
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
            int id;//STUDENT ID MADE FROM HASH
            boolean availablity;


    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }            
    
    public void setMajor(String major) {
        this.major = major;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
    public String getSpecialty() {
        return specialty;
    }

    public boolean isAvailablity() {
        return availablity;
    }
     @Override
    public String toString(){
        return this.name + "->" + this.major + "->" + this.id + "->" + this.availablity + "->" + this.specialty;
    }
    
}
