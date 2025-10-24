package ektu.korgan.sakauov.sro7;

public abstract class SroVehicle implements SroServiceable {
    private String brand;
    private String model;

    public SroVehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
