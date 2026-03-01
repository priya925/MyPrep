package org.example.dsaprep2026.streamproblems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Get2ndHighestSalaryFromEmployeeList {

    public static void main(String [] args){
        int n = 3;
        List<Employee> employeeList = List.of(new Employee("Priya", 200),
                new Employee("Vimal", 300), new Employee("Shruti", 100),
                new Employee("Divya", 500));
        printEmployeeSalaryInDescendingOrder(employeeList);
        printNthHighestSalary(employeeList,n);

    }

    static  void printNthHighestSalary(List<Employee> employeeList, int n) {
        Optional<Employee> e = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(n-1)
                .findFirst();
        System.out.println(e.map(Employee::getSalary));

    }
    static void printEmployeeSalaryInDescendingOrder(List<Employee> employeeList){
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        int i=0;
        while(i< sortedList.size()){
            System.out.println(sortedList.get(i).getSalary());
            i++;
        }
    }
}

class Employee{
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

