package pack2;

public class Student {
    public String name;
    public long roll_num;
    public String course;
    public int semester;
    public String address;

    public Student(String name, long roll_num, String course, int semester, String address) {
        this.name = name;
        this.roll_num = roll_num;
        this.course = course;
        this.semester = semester;
        this.address = address;
    }
    public void show() {
        System.out.println("Name of Student: "+name);
        System.out.println("Roll number: "+roll_num);
        System.out.println("Course: "+course);
        System.out.println("Semester: "+semester);
        System.out.println("Address: "+address);
    }
}
