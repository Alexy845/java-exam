import java.util.Random;

public class Bike extends Vehicle {

    public Bike(String PilotName, int speed, int adhesion) {
        super(PilotName, speed, adhesion);
        Random random = new Random();
        speed = random.nextInt(6) + 5;
        adhesion = random.nextInt(6) + 5;
    }
}
