/**
 * Author Robert Hable
 * Co-Authors, Blake Furlano, Mason Waters, Dr. Amthauer(Driver)
 * 15Sep2019
 * CS245
 * HW 0
 */
import java.util.*;

/**
 * This class extends Employee in an effort to calculate the employees weekly income based on hours worked.
 */
public class Hourly extends Employee {
    Hourly(String name){
        super(name);
        super.setType("Hourly");
    }

    private double wage = 0;
    private double hoursWorked = 0;
    private double weeklyPay = 0;
    String name = super.getName();



    /**
     * This method accepts a Scanner that prompts the user for the wage and total hours worked.
     */
    public void readEmployeeData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hourly wage of employee: ");
        wage = input.nextDouble();
        System.out.print("Enter the number of hours worked: ");
        hoursWorked = input.nextDouble();
    }

    /**
     * This method calculates the weekly income of the employee and includes calculations if the
     * employee worked overtime.
     * @return Will return the weekly income of the employee.
     */
    public double calculateWeeklyPay(){
        if(hoursWorked <= 40){
            weeklyPay = hoursWorked * wage;
        }
        else{
            double overTime = wage * 1.5;
            weeklyPay = wage * 40 + overTime * (hoursWorked-40);
        }
        return weeklyPay;
    }

    /**
     * To string method to print out the employees weekly pay.
     * @return Returns the string and concatenated income.
     */
    public String toString() {

        return super.toString() + "\nWage: " + wage + "\nHours worked this week: " + hoursWorked;
    }
}