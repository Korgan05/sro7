package kz.ektu.korgan.sakauov.lab7;

public class Tea extends Drink {
    private static final double UNIT_BASE = 800.0;
    public Tea() {
        super("Tea", UNIT_BASE);
    }

    @Override
    public double calculatePrice(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) throw new IllegalArgumentException("bad discount");
        double p = UNIT_BASE * (1 - discountPercent / 100.0);
        return Math.round(p * 100.0) / 100.0;
    }
}
