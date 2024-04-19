package HW10;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                // Создаем список активностей
                List<Activity> activities = new ArrayList<>();
                activities.add(new Activity("a", 9, 12));
                activities.add(new Activity("b", 11, 14));
                activities.add(new Activity("c", 13, 16));
                activities.add(new Activity("d", 15, 17));

                // Создаем экземпляр класса ActivityMaxProfit
                ActivityMaxProfit activityMaxProfit = new ActivityMaxProfit();

                // Вызываем метод selectActivity и выводим результаты в консоль
                activityMaxProfit.selectActivity(activities);
        }
}
