/**
 * Author Robert Hable
 * Co-Authors, Blake Furlano, Mason Waters, Dr. Amthauer(Driver)
 * 15Sep2019
 * CS245
 * HW 0
 */

/**
 * our abstract employee class that sets two abstract parameters
 * calculate weekly pay and read employee data.
 */
public abstract class Employee {

    public String employName;
    public String employType;

    /**
     * Method to set the name of our employee that will be used in our toString
     * @param name the name comes from input used in the Driver
     */
    public Employee(String name){
       super();
       this.employName = name;
    }

    /**
     * Method to set the type of employee that we will use to for our toString.
     * @param type returns the type of employee, Hourly or Salary
     */
    public void setType(String type){
        this.employType = type;
    }


    /**
     * gets the employees name
     * @return returns the employees name
     */
    public String getName(){
        return employName;
    }

    /**
     * gets the employees type
     * @return returns the employees type
     */
    public String getType(){
        return employType;
    }
    /**
     * Too string method
     * @return Returns the Name of the employee.
     */
    public String toString(){
        return "Name: " + employName + "\nType: " +  employType;

    }

    /**
     * My abstract methods to be used by all child classes
     * @return will require the pay calculations
     */
    public abstract double calculateWeeklyPay();

    /**
     * Gets specific information from the emplyeee however the information will be different which is why
     * we are using abstract methods.
     */
    public abstract void readEmployeeData();

}
