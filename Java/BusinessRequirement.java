class Employee {
    private int empID;
    private double salary;
    private String name;
    private String address;

    public Employee(int empID, double salary, String name, String address) {
        this.empID = empID;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    public int getEmpID() {
        return empID;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class BusinessRequirement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(101, 50000, "Pratik", "Noida");
        employees[1] = new Employee(101, 50000, "Pratik", "Noida");
        employees[2] = new Employee(101, 50000, "Pratik", "Noida");
        employees[3] = new Employee(101, 50000, "Pratik", "Noida");
        employees[4] = new Employee(101, 50000, "Pratik", "Noida");

        System.out.println("Employee Details:\n");

        for (Employee emp : employees) {
            System.out.println("Employee ID : " + emp.getEmpID());
            System.out.println("Name        : " + emp.getName());
            System.out.println("Salary      : " + emp.getSalary());
            System.out.println("Address     : " + emp.getAddress());
        }
    }
}
