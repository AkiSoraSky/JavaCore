package pack1;

public class Department {
    public String name;
    public String description;
    public int totalEmployee;

    public Department(String name, String description, int totalEmployee) {
        this.name = name;
        this.description = description;
        this.totalEmployee = totalEmployee;
    }
    public void show(){
        System.out.println("Name of Department: " +name);
        System.out.println("Description: " +description);
        System.out.println("Total Employee: " +totalEmployee);
    }
    public void increaseTotalEmployee(){
        totalEmployee+=1;
    }
    public void decreaseTotalEmployee(){
        totalEmployee-=1;
    }

}
