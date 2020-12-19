package aplication;

import aplication.entites.Employee;
import aplication.entites.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of  employees: ");
        int quantEmp = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= quantEmp; i++) {
            System.out.printf("Employee #%d data: %n", i);

            System.out.print("Outsourced? (y/n): ");
            char ch = scan.next().charAt(0);
            scan.nextLine();

            System.out.print("Name: ");
            String name = scan.next();

            System.out.print("Hours: ");
            int hours = scan.nextInt();
            scan.nextLine();

            System.out.print("Value per hour: ");
            double valueHour = scan.nextDouble();

            if (ch == 'y') {
                System.out.print("Additinal charge: ");
                double addCharge = scan.nextDouble();
                Employee OutEmp = new OutsourcedEmployee
                        (name, hours, valueHour, addCharge);
                list.add(OutEmp);
            } else {
                Employee emp = new Employee
                        (name, hours, valueHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp: list) {
            System.out.printf("%s - $ %.2f %n", emp.getName(),emp.payment());

        }



        scan.close();

    }
}
