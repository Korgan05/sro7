package ektu.korgan.sakauov.sro7;

public class SroTruck extends SroVehicle {
    public SroTruck(String brand, String model) { super(brand, model); }
    @Override public void service() { System.out.println("Сервис грузовика: " + toString()); }
}
