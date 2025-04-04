package se.lexicon.Encapsulation;

//Exercise 4
public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getFormattedSalary(){
        return String.format("$%.2f", employee_salary); // % indicates a variables should be shown here and .2f specifies a double and max two decimals should be shown.
    }
}
