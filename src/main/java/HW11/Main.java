package HW11;

// 1 уровень сложности: Задача: вызов лифта
//         В доме два лифта.
//         Реализовать алгоритм отправки ближайшего лифта на вызывающий этаж.
//         Алгоритм будет применяться в домах разной этажности.
//                Пример:
//         в доме 19 этажей
//         работают лифт А и лифт В
//         лифт А находиться на 0 этаже
//         лифт В находиться на 8 этаже
//         на вход: 1
//         отправляем лифт А
public class Main {
    public static void main(String[] args) {
        Building building = new Building(19);
        int callingFloor = 1;
        Elevator nearestElevator = building.findNearestElevator(callingFloor);
        System.out.println("Sending elevator " + nearestElevator + " to floor " + callingFloor);
    }
}