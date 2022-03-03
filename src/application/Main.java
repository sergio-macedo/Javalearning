package application;

import entities.Employee;
import entities.Product;
import entities.Rectangle;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // In this programm I have three diferent kinds of OOP and four diferent Classes attachted to this main
        // Starts with the class Product
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("price ");
        product.price = sc.nextDouble();
        System.out.println("quantity in Stock ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data " + product);
        System.out.println("Enter the number of products to be removed from stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data " + product);

        //Now is the class Rectangle
        System.out.println("type the width and the height of the rectangle");
        Rectangle rectangle = new Rectangle();
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();
        System.out.println(" rectangle area: " + rectangle.area() + " rectangle perimeter: " + rectangle.perimeter() + " rectangle diagonal: " + rectangle.diagonal());
        //The class employee
        System.out.println("type the name of the employee, the gross salary and the tax that he/she has to pay ");
        Employee employee = new Employee();
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();
        System.out.println("The employee's name is " + employee.name + "The salary is " + employee.netSalary());
        System.out.println("Which percentage do you want to increase the gross salary");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("The name and the increased salary are " + employee.name +", " + employee.netSalary());
        //The class Student
        Student student = new Student();
        System.out.println("Type the name of the student and his/hers grades");
        student.studentName = sc.nextLine();
        student.firstTrimester = sc.nextDouble();
        student.secondTrimester = sc.nextDouble();
        student.thirdTrimester = sc.nextDouble();

        System.out.println(student.finalGrade());


        sc.close();
    }
}