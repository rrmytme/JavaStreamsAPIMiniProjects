package org.StreamsAPI;

public class EmployeeFilterSystem {
    private String name;
    private String city;
    private double salary;

    public EmployeeFilterSystem(String name, String city, double salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public String getCity() { return city; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " from " + city + " earns $" + salary;
    }
}

