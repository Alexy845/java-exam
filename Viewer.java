public class Viewer {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Viewer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String toString() {
        return "My name is " + name + " and I've " + money + "$";
    }
}
