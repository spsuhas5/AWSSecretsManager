package com.example.sample.controller;

import com.example.sample.exception.CustomException;
import com.example.sample.model.Employee;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Validated
public class EmployeeController {

//    @GetMapping("/getData")
//    public String getData(@PathParam("data") @NotNull String data) {
//        System.out.println("data: " + data);
//        return data;
//    }
//
//    @PostMapping("/getEmpData")
//    public Employee getEmpData(@RequestBody @Valid Employee employee) {
////        System.out.println("data: " + employee.getEmpId());
//        return employee;
//    }
//
//    @GetMapping("/validateCustomException")
//    public String validateCustomException(@PathParam("data") String data) {
//        if(StringUtils.isBlank(data)){
//            throw new CustomException("data cannot be null/blank/empty");
//        }
//        return data;
//    }

    /*static List<Employee> employeeList = new ArrayList<Employee>();

    static {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    }*/

    public static void main(String[] args) {
        //How many male and female employees are there in the organization?
//        Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(map);

        //Print the name of all departments in the organization
//        employeeList.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);

        //What is the average age of male and female employees
//        Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//        System.out.println(map);

        //Get the details of highest paid employee in the organization
//        Optional<Employee> employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//        System.out.println(employee.get());

        // Get the names of all employees who have joined after 2015
//        List<String> empList = employeeList.stream().filter(employee -> employee.getYearOfJoining()>2015).
//                map(empl -> empl.getName()).collect(Collectors.toList());
//        System.out.println(empList);

        //Get the details of all employees who have joined after 2015
//        List<Employee>  empList = employeeList.stream().filter(employee -> employee.getYearOfJoining()>2015).collect(Collectors.toList());
//        System.out.println(empList);

        //Count the number of employees in each department
//        Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println(map);

        //What is the average salary of each department
//        Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(map);

        //Get the details of youngest male employee in the product development department
//        Employee empl = employeeList.stream()
//                .filter(emp -> emp.getGender().equals("Male") && emp.getDepartment().equals("Product Development"))
//                .sorted(Comparator.comparingInt(Employee::getAge)).findFirst().get();
//        System.out.println(empl);

        //List down the names of all employees in each department
//        Set<Map.Entry<String, List<Employee>>> set = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet();
//        for(Map.Entry<String, List<Employee>> entry : set) {
//            List<Employee> employees = entry.getValue();
//            for (Employee empl : employees) {
//                System.out.println(empl.getDepartment() + " : "+empl.getName());
//            }
//        }

        //What is the average salary and total salary of the whole organization
//        double averageSalary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getAverage();
//        double totalSalary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
//        System.out.println(averageSalary + " : " + totalSalary);

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
//        Map<Boolean, List<Employee>> employees =
//                employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() >= 25));
//
//        System.out.println(employees.get(Boolean.TRUE));
//        System.out.println(employees.get(Boolean.FALSE));
    }

}
