package collectionN_Generics;

import office.Department;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Department> deptList = new ArrayList<>();

        deptList.add(new Department("Accounts","Account Departmrnt",10));
        deptList.add(new Department("IT","Information Tech. Departmrnt",30));
        deptList.add(new Department("Sales","Sales Departmrnt",8));

        for (Department item: deptList) {
            System.out.println(item.name);
            System.out.println(item.description);
            System.out.println(item.totalEmployee);
            System.out.println("--------------------");
        }
        System.out.println(deptList.get(2).name);
        int size = deptList.size();
        System.out.println(size);
        //for sorting we can use collection.sort();
        //deptList.contains();
        deptList.remove(1);
        System.out.println(deptList);
    }
}
