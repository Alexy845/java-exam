public abstract class Vehicle {
    private int DistanceTraveled;



    public int getDistanceTraveled() {
        return DistanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        DistanceTraveled = distanceTraveled;
    }

    private int Speed;

    public  int getSpeed() {
        return Speed;
    }

    private int Adhesion;
    

    public int getAdhesion() {
        return Adhesion;
    }

    private int Out;

    public int getOut() {
        return Out;
    }

    public void setOut(int out) {
        Out = out;
    }

    private String PilotName;

    public String getPilotName() {
        return PilotName;
    }

    private boolean End;

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
        Adhesion = 1 + (int)(Math.random() * ((10 - 1) + 1));
        Speed = 1 + (int)(Math.random() * ((10 - 1) + 1));
        Out = 0;
        End = false;
    }

    public static int Forward(int Speed, int Adhesion, boolean Out) {
        if (Out) {
            return 0;
        }
        int forward = Speed * (11 - Adhesion);
        return forward;
    }

    public static void Accident(int Adhesion) {
        int n = 1 + (int)(Math.random() * ((10 - 1) + 1));
        

        if (n > Adhesion) {
            int Out = n - Adhesion;
            System.out.println("Le pilote est en accident pendant " + Out + " tour(s) et ne peut plus bouger.");
        }
    }
    
    }

