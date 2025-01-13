import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Вычисляем среднее значение четных чисел
        double average = numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтруем четные числа
                .mapToDouble(n -> n) // Преобразуем в поток double
                .average() // Вычисляем среднее значение
                .orElse(Double.NaN); // Возвращаем NaN, если список пуст или нет четных чисел

        // Выводим результат
        if (!Double.isNaN(average)) {
            System.out.println("Среднее значение четных чисел: " + average);
        } else {
            System.out.println("Нет четных чисел в списке.");
        }
    }
}
