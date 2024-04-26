package BackpackTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item(10, 60, 6);
        Item item2 = new Item(20, 100, 5);
        Item item3 = new Item(30, 120, 4);



        List<Item> list = Arrays.asList(item1, item2, item3);
        System.out.println(fillBackpack(list,50));


    }

    public static Integer fillBackpack(List<Item> list, int weight) {
        list.sort(Comparator.comparing(Item::getCost).reversed());
        List<Item> rucksack = new ArrayList<>();
        for (Item item:list) {
            if (weight >= item.getWeight()){
                rucksack.add(item);
                weight -= item.getWeight();
            }else {
                int fraction = weight; // ostatok Mesta
                int price = fraction * item.getCost();
                Item item4 = new Item(fraction,price, item.getCost());
                rucksack.add(item4);
                weight -= fraction;
            }
        }
        int sum = 0;
        for (Item item : rucksack) {
            sum = sum + item.getPrice();
        }
        return sum;
    }
}