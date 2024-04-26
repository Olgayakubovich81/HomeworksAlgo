package HW11;
public class Elevator {

    private int currentFloor;
    private boolean isWorking;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
        this.isWorking = true;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "currentFloor=" + currentFloor +
                ", isWorking=" + isWorking +
                '}';
    }
}
