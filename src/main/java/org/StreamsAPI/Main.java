package org.StreamsAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Project1 call:
        List<EmployeeFilterSystem> employees = Arrays.asList(
                new EmployeeFilterSystem("John Doe", "New York", 60000),
                new EmployeeFilterSystem("Jane Smith", "Los Angeles", 45000),
                new EmployeeFilterSystem("Mark Taylor", "New York", 52000),
                new EmployeeFilterSystem("Lucy Brown", "Chicago", 58000)
        );

        List<EmployeeFilterSystem> filteredEmployees = employees.stream()
                .filter(emp -> emp.getCity().equals("New York"))
                .filter(emp -> emp.getSalary() > 50000)
                .collect(Collectors.toList());

        filteredEmployees.forEach(System.out::println);

        // Project2 call:
        List<BankTransactions> transactions = Arrays.asList(
                new BankTransactions(2000),
                new BankTransactions(-500),
                new BankTransactions(1500),
                new BankTransactions(-300),
                new BankTransactions(700)
        );

        double totalDeposits = transactions.stream()
                .map(BankTransactions::getAmount)
                .filter(amount -> amount > 0)
                .reduce(0.0, Double::sum);

        System.out.println("Total Deposits: $" + totalDeposits);

        // Project3 call:
        List<StudentGrades> students = Arrays.asList(
                new StudentGrades("Alice", 85),
                new StudentGrades("Bob", 76),
                new StudentGrades("Charlie", 92),
                new StudentGrades("Daisy", 65),
                new StudentGrades("Ethan", 88)
        );

        List<String> topStudents = students.stream()
                .filter(student -> student.getScore() > 80)
                .sorted(Comparator.comparing(StudentGrades::getName))
                .map(StudentGrades::getName)
                .collect(Collectors.toList());

        System.out.println("Top Students: " + topStudents);

    }

}