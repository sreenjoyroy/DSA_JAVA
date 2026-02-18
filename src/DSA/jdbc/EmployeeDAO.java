package DSA.jdbc;
import java.sql.*;
import java.util.Collections;

public class EmployeeDAO {
    public static Connection connecToDb() {
        String connectionURL = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Root123";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionURL,username,password);
        } catch (Exception e) {
            System.out.println("Database Connection failed");
        }
        return connection;
    }
    public Employee readEmployeeeDetails(){
        System.out.println("Enter the name of the employee:");
        String name = EmployeeDemo.scanner.nextLine();
        System.out.println("Enter the name of the employee:");
        String designation = EmployeeDemo.scanner.nextLine();
        System.out.println("Enter the name of the employee:");
        float salary = EmployeeDemo.scanner.nextFloat();
        System.out.println("Enter the name of the employee:");
        int yearsOfExperience = EmployeeDemo.scanner.nextInt();

        return new Employee(name,designation,salary,yearsOfExperience);
    }
    public void createEmployee(){
        Employee employee = readEmployeeeDetails();
//        String query = "insert into employees(name,designamtion,salary,years_of_experience)("nithin","trainer",198000,16)";
        String query = "insert into employees(name,designation,salary,years_of_experience)(%s,%s,%d,%f)";
        try{
            Connection connection = connecToDb();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getDesignation());
            ps.setFloat(3,employee.getSalary());
            ps.setInt(4,employee.getYearsOfExperience());
            boolean inserted = ps.execute();
            if(inserted){
                System.out.println("Row inserted !");
            }
            ps.close();
            connection.close();
        }catch (SQLException e){
            System.out.println("Row insertion failed");
        }
    }
    public void searchEmployee(int id){
        String query = "select * from employees where id = %d" ;
        try{
            Connection connection = connecToDb();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Employee employee = new Employee(rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getInt(4));
                System.out.println();
            }
            ps.close();
            connection.close();
        }catch (SQLException e){
            System.out.println("Row insertion failed");
        }
    }
    public void createTable(){
        String query = "create table IF NOT EXISTS employee(id int PRIMARY KEY auto_increment, name varchar(32) not null, designation varchar(32), salary float, years_of_experience int)";
        try{
            Connection connection = connectToDb();
            Statement statement = connection.createStatement();

        }
    }
}
