package ektu.korgan.sakauov.sro7;

public class SroCar extends SroVehicle {
    public SroCar(String brand, String model) { super(brand, model); }
    @Override public void service() { System.out.println("Сервис легкового авто: " + toString()); }
}
