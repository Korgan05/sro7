package ektu.korgan.sakauov.sro7;

public class SroBus extends SroVehicle {
    public SroBus(String brand, String model) { super(brand, model); }
    @Override public void service() { System.out.println("Сервис автобуса: " + toString()); }
}
