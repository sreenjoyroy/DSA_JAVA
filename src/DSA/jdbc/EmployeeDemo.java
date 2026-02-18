package DSA.jdbc;

import java.util.Scanner;

public class EmployeeDemo {
    public static Scanner scanner ;
    static {
        scanner =  new Scanner (System.in);
    }

    public static void main(String[] args) {
        EmployeeDAO  dao= new EmployeeDAO();
        EmployeeService oprs = new EmployeeService();
        int choice=0;

        do{
            switch(choice){
                case 1:
                    oprs.addEmployee(dao);
                    break;
                case 2:
                    oprs.deleteEmployee(dao);

                    break;
                case 3:
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6:
                    choice =0;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice);
        System.out.println("End of the program");
        scanner.close();
    }
}
