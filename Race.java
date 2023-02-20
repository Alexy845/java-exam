import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Race {
    private int MinVehicle;
    private int MaxVehicle;
    private List<Vehicle> allVehicles;
    private List<Viewer> allViewers;

    public Race(int MinVehicle, int MaxVehicle) {
        this.MinVehicle = MinVehicle;
        this.MaxVehicle = MaxVehicle;
        allVehicles = new ArrayList<Vehicle>();
        allViewers = new ArrayList<Viewer>();
    }

    public void addViewer(Viewer viewer) {
        allViewers.add(viewer);
    }

    public void addVehicle(Vehicle vehicle) {
        if (allVehicles.size() < MaxVehicle) {
            allVehicles.add(vehicle);
        }
        else {
            System.out.println("Max number");
        }
    }

    public void startRace() {
        if (allVehicles.size() < MinVehicle) {
            System.out.println("Not enough vehicles");
        }
        int dist = (int) (Math.random() * 1001) + 100;
        for (int i = 0; i < dist; i++) {
            System.out.println("Distance: " + (i + 1));
            Collections.shuffle(allVehicles);
            for (Vehicle vehicle : allVehicles) {
                vehicle.Forward();
                if (vehicle.getDistanceTraveled() >= dist) {
                    vehicle.setEnd(true);
                }
            }
        }
        System.out.println("Final Ranking:");
        Collections.sort(allVehicles, Collections.reverseOrder());
        for (int j = 0; j < allVehicles.size(); j++) {
            System.out.println((j + 1) + ". " + allVehicles.get(j).toString());
        }
    }
}




