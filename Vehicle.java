import java.util.Random;

public abstract class Vehicle {
    private int DistanceTraveled;
    private int Speed;
    private int Adhesion;
    private int Out;
    private String PilotName;
    private boolean End;

    public int getDistanceTraveled() {
        return DistanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        DistanceTraveled = distanceTraveled;
    }

    public  int getSpeed() {
        return Speed;
    }

    public int getAdhesion() {
        return Adhesion;
    }

    public int getOut() {
        return Out;
    }

    public void setOut(int out) {
        Out = out;
    }

    public String getPilotName() {
        return PilotName;
    }

    public boolean isEnd() {
        return End;
    }

    public void setEnd(boolean end) {
        End = end;
    }

    public Vehicle(String PilotName,int Speed, int Adhesion){
        this.PilotName = PilotName;
        this.Speed = Speed;
        this.Adhesion = Adhesion;
        Out = 0;
        End = false;
    }
    public void Forward() {
        if (this.Out == 0) {
            Random rand = new Random();
            int n = rand.nextInt(10) + 1;
            int distance = this.Speed * (11 - this.Adhesion);
            if (n > this.Adhesion) {
                this.Accident();
            }
            this.DistanceTraveled += distance;
        }
    }

    public void Accident() {
        int min = 1;
        int max = 10;
        int n = (int)Math.floor(Math.random() * (max - min + 1) + min);

        int out = n - this.Adhesion;
        this.Out = out > 0 ? out : 1;
    }
    
    public String toString() {
        String speedStr;
        if (Speed <= 2) {
            speedStr = "slow";
        } else if (Speed <= 4) {
            speedStr = "rather slow";
        } else if (Speed <= 6) {
            speedStr = "rather fast";
        } else if (Speed <= 8) {
            speedStr = "fast";
        } else {
            speedStr = "very fast";
        }

        String adhesionStr;
        if (Adhesion <= 2) {
            adhesionStr = "barely sticks to the ground";
        } else if (Adhesion <= 4) {
            adhesionStr = "sticks to the ground";
        } else if (Adhesion <= 6) {
            adhesionStr = "grips the ground quite well";
        } else if (Adhesion <= 8) {
            adhesionStr = "adheres well to the ground";
        } else {
            adhesionStr = "adheres perfectly to the ground";
        }

        return "This " + getClass().getSimpleName().toUpperCase() + " is " + speedStr +
                ", it has a " + Speed + " speed value, and it " + adhesionStr +
                " with a " + Adhesion + " value of adhesion";
    }
}