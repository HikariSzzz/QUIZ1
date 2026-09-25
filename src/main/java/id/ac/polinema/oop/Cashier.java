package id.ac.polinema.oop;

public class Cashier {
    private String cashierName;

    public Cashier(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public double processPayment(Order order, double amountPaid) {
        double total = order.getTotalPrice();
        if (amountPaid < total) {
            return -1;
        }
        return amountPaid - total;
    }
}

