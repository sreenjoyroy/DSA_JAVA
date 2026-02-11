package DSA.Sort;
import java.time.*;
import java.util.*;

public class Employee {
    private int id;
    private String name;
    private int Experience;
    private LocalDate dateOfBirth;
    private LocalTime TimeofBirth;
    private long phoneNumber;

    public Employee(int id,String name,int Experience, LocalDate dateOfBirth,LocalTime timeofBirth,long phoneNumber){
        setId(id);
        setName(name);
        setExperience(Experience);
        setDateOfBirth(dateOfBirth);
        setTimeofBirth(timeofBirth);
        setPhoneNumber(phoneNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalTime getTimeofBirth() {
        return TimeofBirth;
    }

    public void setTimeofBirth(LocalTime timeofBirth) {
        TimeofBirth = timeofBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        return "id : "  + getId()+
                ", name : " + getName()+
                ", experience : "+ getExperience()+
                ", dob : " +getDateOfBirth()+
                ", Time of Birth : " + getTimeofBirth()+
                ", Phone Number : " + getPhoneNumber();
    }


}
