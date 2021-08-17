package pack2;

import java.util.Arrays;

public class College {
    public static void main(String[] args) {

        Student s1 = new Student("Aatma", 1001,"MCA",2,"Hazratganj");
        Student s2 = new Student("Satma", 1002,"B.Tech",5,"Gomtinagar");
        Student s3 = new Student("Khatma", 1003,"MCA",3,"Telibagh");

        for (Student students: Arrays.asList(s1, s2, s3)) {
            students.show();
        }
    }
}
