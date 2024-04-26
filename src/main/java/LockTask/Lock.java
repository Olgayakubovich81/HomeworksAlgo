package LockTask;
//Вам дан замок, состоящий из n различных круглых колец, на каждом из которых последовательно напечатаны цифры от 0 до 9.
//
//        Изначально все n-колец вместе показывают n-значное целое число, но существует только определенный код, который может открыть замок.
//
//        Вы можете вращать каждое кольцо любое количество раз в любом направлении.
//
//        Вы должны найти минимальное количество оборотов на кольцах замка, чтобы открыть замок.
public class Lock {
    public static void main(String[] args) {

//        Ввод: Ввод = 2345, Код разблокировки = 5432
//        Выход: требуется оборотов = 8

        int input = 2345;
        int unlockCode = 5432;

        int resultRotation = minCountRotation(input, unlockCode);
        System.out.println("Min rotation for input: " + input + " is " + resultRotation);
    }

    private static int minCountRotation(int input, int unlockCode) {
        int rotation = 0;
        int inputDigit;
        int unlockCodeDigit;

        while (input > 0 || unlockCode > 0) {
            inputDigit = input % 10;
            unlockCodeDigit = unlockCode % 10;

            int forwardRotation = Math.abs(inputDigit - unlockCodeDigit);
            int backRotation = 10 - Math.abs(inputDigit - unlockCodeDigit);
            int minRotation = Math.min(forwardRotation, backRotation);

            rotation = rotation + minRotation;

            input = input / 10;
            unlockCode = unlockCode / 10;
        }

        return rotation;
    }
}

//Конечно, давайте разберем этот код по шагам:
//
//        В методе main задаются входные данные:
//        input (ввод) -
//        unlockCode (код разблокировки) - число, представляющее требуемое положение колец для открытия замка.
//        Затем вызывается метод minCountRotation, передавая ему в качестве аргументов ввод и код разблокировки.
//        В методе minCountRotation:
//        Инициализируются переменные rotation для подсчета общего количества оборотов и inputDigit, unlockCodeDigit для хранения текущих цифр на каждой позиции.
//        Запускается цикл while, который будет выполняться, пока хотя бы одно из чисел (input или unlockCode) не станет равным нулю.
//        На каждой итерации извлекаются последние цифры из input и unlockCode.
//        Вычисляются разницы между соответствующими цифрами: в прямом направлении (forwardRotation) и в обратном (backRotation).
//        Определяется минимальное количество оборотов для текущей позиции с помощью функции Math.min.
//        Полученное количество оборотов добавляется к общему числу оборотов rotation.
//        Убирается последняя цифра из input и unlockCode путем деления на 10.
//        По завершении цикла возвращается общее количество оборотов rotation, необходимых для разблокировки замка.
//        Таким образом, данный код эффективно вычисляет минимальное количество оборотов, необходимых для разблокировки замка, с учетом текущего положения колец и требуемого кода разблокировки.