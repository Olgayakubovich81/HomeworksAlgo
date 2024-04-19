package HW10;

public class Activity {
    private String name;
    private int start;
    private int finish;

    public Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public int getFinish() {
        return finish;
    }
}


