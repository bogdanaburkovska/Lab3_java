import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запитуємо користувача про розмір масивів
        System.out.print("Введіть розмір масивів: ");
        int n = scanner.nextInt();

        // Ініціалізуємо масиви a, b та c згідно введеного розміру
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        // Зчитуємо елементи масивів a та b з клавіатури
        System.out.println("Введіть елементи масиву a:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Введіть елементи масиву b:");
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        // Обчислюємо різниці між відповідними елементами масивів a та b та записуємо їх у масив c
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }

        // Виводимо масив c
        System.out.println("Масив c (різниці між відповідними елементами масивів a та b):");
        for (int i = 0; i < n; i++) {
            System.out.println("c[" + i + "]: " + c[i]);
        }
    }
}
