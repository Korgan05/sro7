package kz.ektu.korgan.sakauov.lab7;

public abstract class Drink {
    private final String label;
    private final double priceBase;

    Drink(String label, double priceBase) {
        this.label = label;
        this.priceBase = priceBase;
    }

    public abstract double calculatePrice(double discountPercent);

    @Override
    public String toString() {
        return label + " (" + String.format("%.2f", priceBase) + ")";
    }
}