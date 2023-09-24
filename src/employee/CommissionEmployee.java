package employee;

/**
 * @author rajimalimiya
 * @created 19/09/2023 - 07:51
 * @project StudentProject
 **/
public class CommissionEmployee  extends Employee {
    private double rate;
    private double totalSales;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double totalSalary() {
        return this.rate * this.totalSales;
    }
}
