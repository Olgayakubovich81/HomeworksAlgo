package HW11;

class Building {
    private int totalFloors;

    private Elevator elevatorA;
    private Elevator elevatorB;

    public Building(int totalFloors) {
        this.totalFloors = totalFloors;
        this.elevatorA = new Elevator(0); // Пусть лифт A находится на нулевом этаже
        this.elevatorB = new Elevator(8); // Пусть лифт B находится на восьмом этаже
    }

    public Elevator findNearestElevator(int floor) {
        int distanceToA = Math.abs(elevatorA.getCurrentFloor() - floor);
        int distanceToB = Math.abs(elevatorB.getCurrentFloor() - floor);

        if (distanceToA < distanceToB) {
            return elevatorA;
        } else {
            return elevatorB;
        }
    }
}
