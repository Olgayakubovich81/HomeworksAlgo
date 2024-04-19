package HW10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public void selectActivity(List<Activity> list) {
        list.sort(Comparator.comparingInt(Activity::getFinish));
        List<Activity> res = new ArrayList<>();
        Activity first = list.get(0);
        int last = first.getFinish();
        res.add(first);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).getStart() >= last) {
                last = list.get(i).getFinish();
                res.add(list.get(i));
            }
        }
        print(res);
    }

    private void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e.getName() + "  " + e.getStart() + "->" + e.getFinish());
        }
    }
}
