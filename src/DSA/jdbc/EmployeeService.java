package DSA.jdbc;

public class EmployeeService {
    private EmployeeDAO dao;
    {
        dao = new EmployeeDAO();
    }
    public void addEmployee(){
        dao.createEmployee();
    }
    public void searchEmployee(){
        System.out.println("Enter id of the employee to be searched:");
        int id  = EmployeeDemo.scanner.nextInt();
        dao.searchEmployee(id);
    }
    public void deleteEmployee(int id){

    }
}
