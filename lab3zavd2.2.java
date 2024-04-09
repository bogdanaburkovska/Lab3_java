import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10; // Змінна n - розмірність масиву
        int[] array = new int[n];

        // Заповнення масиву випадковими числами з відрізка [-100; 100]
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(201) - 100; // генерує випадкове число в діапазоні [-100, 100]
        }

        // Виклик методу для знаходження мінімального елементу масиву
        int minElement = findMinElement(array);
        System.out.println("Мінімальний елемент масиву: " + minElement);

        // Виклик методу для знаходження суми елементів масиву між першим і другим від'ємними елементами
        int sumBetweenNegatives = sumBetweenNegatives(array);
        System.out.println("Сума елементів масиву, розташованих між першим і другим від'ємними елементами: " + sumBetweenNegatives);
    }

    // Метод для знаходження мінімального елементу масиву
    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Метод для знаходження суми елементів масиву між першим і другим від'ємними елементами
    public static int sumBetweenNegatives(int[] array) {
        int firstNegativeIndex = -1;
        int secondNegativeIndex = -1;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                } else {
                    secondNegativeIndex = i;
                    break;
                }
            }
        }

        if (firstNegativeIndex != -1 && secondNegativeIndex != -1) {
            for (int i = firstNegativeIndex + 1; i < secondNegativeIndex; i++) {
                sum += array[i];
            }
        }

        return sum;
    }
}
