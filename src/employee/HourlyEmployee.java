package employee;

/**
 * @author rajimalimiya
 * @created 19/09/2023 - 07:50
 * @project StudentProject
 **/
public class HourlyEmployee extends Employee {

    private int hours;

    private double ratePerHour;


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double totalSalary() {
        return this.hours * this.ratePerHour;
    }
}
