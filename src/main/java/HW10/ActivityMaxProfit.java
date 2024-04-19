package HW10;

import HW10.Activity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivityMaxProfit {
    public void selectActivity(List<Activity> list) {
        // Сортируем список активностей по убыванию их стоимости
        list.sort(Comparator.comparingInt(this::calculateCost).reversed());

        // Инициализируем список выбранных активностей
        List<Activity> res = new ArrayList<>();

        // Устанавливаем начальное время
        int currentTime = 9;

        // Проходим по списку активностей
        for (Activity activity : list) {
            // Проверяем, если активность помещается в оставшееся время работы зала
            if (activity.getFinish() <= 17 && activity.getStart() >= currentTime) {
                // Добавляем активность в список выбранных
                res.add(activity);
                // Обновляем текущее время
                currentTime = activity.getFinish();
            }
        }

        // Выводим результат
        print(res);
    }

    // Метод для расчета стоимости активности
    private int calculateCost(Activity activity) {
        // Рассчитываем стоимость активности
        int cost;
        if (activity.getStart() < 13 && activity.getFinish() <= 13) {
            cost = 1;
        } else if (activity.getStart() < 13 && activity.getFinish() > 13) {
            cost = (13 - activity.getStart()) + 2 * (activity.getFinish() - 13);
        } else {
            cost = 2 * (activity.getFinish() - activity.getStart());
        }

        return cost;
    }

    // Метод для вывода списка активностей
    private void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e.getName() + "  " + e.getStart() + "->" + e.getFinish());
        }
    }
}
