package _15_OOP.interface_1.bank;

public class Payment {
    private final double amount;
    private final String currency;
    private boolean processed;

    public Payment(double amount, String currency, boolean processed) {
        this.amount = amount;
        this.currency = currency;
        this.processed = processed;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
