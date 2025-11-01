package kz.ektu.korgan.sakauov.lab7;

public class Coffee extends Drink {
    private static final double UNIT_BASE = 1200.0;
    public Coffee() {
        super("Coffee", UNIT_BASE);
    }

    @Override
    public double calculatePrice(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) throw new IllegalArgumentException("bad discount");
        double p = UNIT_BASE * (1 - discountPercent / 100.0);
        return Math.round(p * 100.0) / 100.0;
    }
}

