package ektu.korgan.sakauov.sro7;

import java.util.ArrayList;
import java.util.List;

public class SroGarage<T extends SroVehicle> {
    private final int capacity;
    private final List<T> vehicles = new ArrayList<>();

    public SroGarage(int capacity) { this.capacity = capacity; }

    public void addVehicle(T v) throws SroGarageFullException {
        if (vehicles.size() >= capacity) throw new SroGarageFullException("Гараж полон");
        vehicles.add(v);
    }

    public void serviceAll() { for (T v : vehicles) v.service(); }
    public List<T> listVehicles() { return new ArrayList<>(vehicles); }
}
