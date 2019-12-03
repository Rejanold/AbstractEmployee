/**
 * Author Robert Hable
 * Co-Authors, Blake Furlano, Mason Waters, Dr. Amthauer(Driver)
 * 15Sep2019
 * CS245
 * HW 0
 */

import java.util.*;

/**
 * This class extends Employee and is for employees with the income of a salary.
 */
public class Salary extends Employee {
    public Salary(String name){
        super(name);
        super.setType("Salary");

    }
    private double salary = 0;
    //private double weeklyPay = 0;

    /**
     * A simple command to aquire the annual salary of the employee.
     */
    public void readEmployeeData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the yearly salary of employee: ");
        salary = input.nextDouble();
    }

    /**
     * This method calculates the employees weekly income based off their anual salary.
     * @return returns the weekly income after its calculated.
     */
    public double calculateWeeklyPay(){
        double weeklyPay = salary / 52.0;
        return weeklyPay;
    }

    /**
     * This is a to String method so that we can print out the weekly income of the employee.
     * @return returns the string of weekly pay and employees income for the week.
     */
    public String toString(){
        return super.toString() + "\nYearly Salary: " + salary;
    }
}




