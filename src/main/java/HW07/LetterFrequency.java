package HW07;

import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    public static void main(String[] args) {
        String text = "Пример текста для подсчета частоты букв в русском алфавите";

        // Создаем HashMap для хранения частоты встречаемости букв
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Проходим по каждому символу в тексте и увеличиваем его частоту в словаре
        for (char letter : text.toCharArray()) {
            if (Character.isLetter(letter)) { // Проверяем, является ли символ буквой
                letter = Character.toLowerCase(letter); // Приводим букву к нижнему регистру для учета регистра
                frequencyMap.put(letter, frequencyMap.getOrDefault(letter, 0) + 1); // Увеличиваем счетчик частоты
            }
        }

        // Выводим результаты
        System.out.println("Частота букв в тексте:");
        for (char letter : frequencyMap.keySet()) {
            System.out.println("'" + letter + "': " + frequencyMap.get(letter));
        }

        // Выводим количество различных букв
        System.out.println("Количество различных букв: " + frequencyMap.size());
    }
}
