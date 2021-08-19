package office;

public class Employee {
    public static final String COMPANY = "ASD Ltd";
    public String name;
    public String address;
    public Department dept;
    public String designation;
    public String id;

    public Employee(String name, String address, Department dept, String designation, String id) {
        this.name = name;
        this.address = address;
        this.dept = dept;
        this.designation = designation;
        this.id = id;
    }

    public void show() {
        System.out.println("Company: " +COMPANY);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + designation);
        System.out.println("ID: " + id);
    }
}
