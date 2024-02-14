package logic;

public class PC {

    //variables
    private int id;
    private float consumption;
    private boolean turnedOn;
    private int time;
    private int voltage;
    private float current;

    //constructor
    public PC(int num) {
        this.setId(num);
        this.setTime(2);
        this.setVoltage(230);
        this.setCurrent((float) 2.17);
        this.setTurnedOn(true);
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public float getCurrent() {
        return current;
    }

    public void setCurrent(float current) {
        this.current = current;
    }

    //methods
    public void turnOff() throws Exception {
        if (!this.isTurnedOn()) {
            throw new Exception("PC " + this.getId() + "is already turned off");
        } else {
            this.setTurnedOn(false);
            this.setTime(0);
        }
    }

    public float calculateConsumption(int V, float I, int T) {
        return V * I * T;
    }

}
