package HW03;
public class TowerOfHanoiIterative {
    public static void main(String[] args) {
        int num = 3;
        towerOfHanoi(num, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int num, char from, char to, char help) {
        int totalMoves = (int) Math.pow(2, num) - 1;

        if (num % 2 == 0) {
            char temp = to;
            to = help;
            help = temp;
        }

        for (int move = 1; move <= totalMoves; move++) {
            if (move % 3 == 1) {
                System.out.println("Move disk from " + from + " to " + to);
            } else if (move % 3 == 2) {
                System.out.println("Move disk from " + from + " to " + help);
            } else if (move % 3 == 0) {
                System.out.println("Move disk from " + help + " to " + to);
            }
        }
    }
}