package com.ikhsan.employeetest;

public class ManagerTest {

    public static void main(String[] args) {
//        Employee[] staff = new Employee[3];
//        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
//        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
//        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
//        int i;
//        for (i = 0; i < 3; i++) {
//            staff[i].raiseSalary(5);
//        }
//        for (i = 0; i < 3; i++) {
//            staff[i].print();
//        }
        Sortable[] staff = new Sortable[3];
        staff[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);

        // Sort the staff array using shell_sort
        Manager manager = new Manager("", 0, 0, 0, 0);
        manager.shell_sort(staff);

        // Print the sorted result
        for (Sortable employee : staff) {
            System.out.println(employee.toString());
        }
    }
}
