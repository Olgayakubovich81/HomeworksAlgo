package HW11;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elevator)) return false;
        Elevator elevator = (Elevator) o;
        return currentFloor == elevator.currentFloor && isWorking == elevator.isWorking;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentFloor, isWorking);
    }
}
