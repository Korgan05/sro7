package ektu.korgan.sakauov.sro7;

public class FleetRunner {
    public static void main(String[] args) throws Exception {
        SroGarage<SroVehicle> g = new SroGarage<>(5);
        g.addVehicle(new SroCar("Toyota", "Corolla"));
        g.addVehicle(new SroTruck("MAN", "TGS"));
        g.addVehicle(new SroBus("Mercedes", "Citaro"));

        System.out.println("Список авто:");
        for (SroVehicle v : g.listVehicles()) System.out.println(v);

        System.out.println("\nОбслуживание:");
        g.serviceAll();
    }
}
