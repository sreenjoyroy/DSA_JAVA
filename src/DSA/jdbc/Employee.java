package DSA.jdbc;

public class Employee {
    private int id;
    private String name;
    private String designation;
    private float salary;
    private int yearsOfExperience;

    Employee(String name,String designation,float salary,int yearsOfExperience){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public  float getSalary(){
        return  salary;

    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

}
