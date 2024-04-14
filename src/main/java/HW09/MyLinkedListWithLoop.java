package HW09;

public class MyLinkedListWithLoop {
          Node head;

        // Остальные методы класса MyLinkedList остаются неизменными

        public void createLoop() {
            // Если список пуст или содержит только один элемент, не создавать петлю
            if (head == null || head.getNext() == null) {
                return;
            }

            // Найти последний элемент списка
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }

            // Создать петлю, соединив последний элемент со вторым
            last.setNext(head.getNext());
        }

        public boolean detectLoop() {
            Node slow = head;
            Node fast = head;

            // Используем алгоритм Флойда для обнаружения петли
            while (fast != null && fast.getNext() != null) {
                slow = slow.getNext();      // Медленный указатель движется на один узел
                fast = fast.getNext().getNext();  // Быстрый указатель движется на два узла

                // Если быстрый и медленный указатели встречаются, значит, есть петля
                if (slow == fast) {
                    return true;
                }
            }

            // Если мы дошли до конца списка без обнаружения петли
            return false;
        }
    }
