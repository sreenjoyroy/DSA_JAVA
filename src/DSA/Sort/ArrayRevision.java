package DSA.Sort;
import java.time.*;
import java.util.*;

public class ArrayRevision {
    public static void main(String[] args) {
        Employee[]  employees = {
                new Employee(1,"Abc",2,
                        LocalDate.of(2004,Month.JUNE,15),
                        LocalTime.of(11,50),516346151311L),
                new Employee(2, "Rohan", 3,
                        LocalDate.of(2001, Month.JANUARY, 10),
                        LocalTime.of(9, 30), 789456123456L),

                new Employee(3, "Sneha", 1,
                        LocalDate.of(2003, Month.MARCH, 22),
                        LocalTime.of(10, 15), 654789321654L),

                new Employee(4, "Amit", 4,
                        LocalDate.of(1999, Month.AUGUST, 5),
                        LocalTime.of(8, 45), 987321654987L),

                new Employee(5, "Priya", 2,
                        LocalDate.of(2002, Month.DECEMBER, 18),
                        LocalTime.of(12, 0), 741852963741L),

                new Employee(6, "Kunal", 5,
                        LocalDate.of(1998, Month.JULY, 29),
                        LocalTime.of(14, 20), 369258147369L)

        };

//        List<Employee> sortedEmployee = getSortedEmployee(employees);
//        for(Employee a: sortedEmployee){
//            System.out.println(a);
//        }

        List<List<String>> data = new ArrayList<>();

        data.add(List.of("201", "Zayan", "zayan@gmail.com", "4", "1997-11-23", "09:40", "9876543210"));
        data.add(List.of("202", "Meera", "meera@gmail.com", "2", "2001-06-14", "07:20", "9123456789"));
        data.add(List.of("203", "Arjun", "arjun@gmail.com", "6", "1995-03-02", "10:05", "9988776655"));
        data.add(List.of("204", "Kavya", "kavya@gmail.com", "3", "1997-11-23", "06:50", "8899001122"));
        data.add(List.of("205", "Ishaan", "ishaan@gmail.com", "5", "1999-09-18", "08:30", "9001122334"));
        data.add(List.of("206", "Ritika", "ritika@gmail.com", "1", "2001-06-14", "09:10", "9011223344"));

        List<List<String>> newSorted = getSortedList(data);
        
        for(int i =0;i<newSorted.size();i++){
            System.out.println(newSorted.get(i).get(0)+" "+
                    newSorted.get(i).get(1)+" "+
                    newSorted.get(i).get(2)+" "+
                    newSorted.get(i).get(3)+" "+
                    newSorted.get(i).get(4)+" "+
                    newSorted.get(i).get(5)+" "+
                    newSorted.get(i).get(6));
        }

    }
    public static List<List<String>> getSortedList(List<List<String>> data){
        data.sort((l1,l2)->{
            LocalTime t1 = LocalTime.parse(l1.get(5));
            LocalTime t2 = LocalTime.parse(l2.get(5));
            LocalDate d1 = LocalDate.parse(l1.get(4));
            LocalDate d2 = LocalDate.parse(l2.get(4));
            int a = d1.compareTo(d2);
            if(a!=0){
                return d1.compareTo(d2);
            }else{
                return t1.compareTo(t2);
            }
        });
        return data;
    }
    public static List<Employee> getSortedEmployee(Employee[] employees){
        List<Employee> list = Arrays.asList(employees);
        Collections.sort(list, new CompareByDateTime());
        return list;
    }

}
class CompareByDateTime implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        int a = e2.getDateOfBirth().compareTo(e1.getDateOfBirth());
        if (a!=0 ){
            return e2.getDateOfBirth().compareTo(e1.getDateOfBirth());
        }else{
            return e2.getTimeofBirth().compareTo(e1.getTimeofBirth());
        }
    }
}
//class CompareByTime implements Comparator<Employee>{
//    @Override
//    public int compare(Employee e1, Employee e2){
//        return e1.getTimeofBirth().compareTo(e2.getTimeofBirth());
//    }
//}
