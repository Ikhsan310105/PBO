package com.ikhsan.firm;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        // Calculate the pay for hours worked
        double hourlyPay = super.pay();

        // Calculate the pay from commission on sales
        double commissionPay = totalSales * commissionRate;

        // Reset total sales to 0
        totalSales = 0;

        // Return the total pay
        return hourlyPay + commissionPay;
    }

    @Override
    public String toString() {
        // Get the parent class's information
        String hourlyInfo = super.toString();

        // Add total sales information
        return hourlyInfo + "\nTotal Sales: $" + totalSales;
    }
}

