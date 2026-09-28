package Sem.com;

import java.util.Scanner;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int myInt = scanner.nextInt();
        System.out.print("Введіть логічне значення: ");
        boolean myBoolean = scanner.nextBoolean();
        System.out.print("Введіть число з плаваючою точкою: ");
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть текст: ");
        String myString = scanner.nextLine();
        System.out.println("\n");

        System.out.println("1. Введений рядок: " + myString + ", Введене ціле число: " + myInt);
        System.out.println("2. Логічне значення: " + myBoolean);
        System.out.println("3. Дробове число: " + myDouble);

        String template1 = "4. Дробове число: {0}, а логічне значення: {1}";
        System.out.println(MessageFormat.format(template1, myDouble, myBoolean));

        String template2 = "5. Ціле число: {0}, рядок: {1}";
        System.out.println(MessageFormat.format(template2, myInt, myString));

        System.out.printf("6. Шістнадцятковий код цілого числа: %x%n", myInt);
        System.out.printf("7. Вісімковий код цілого числа: %o%n", myInt);
        System.out.printf("8. Рядок шириною 20 символів: %20s%n", myString);
        System.out.printf("9. Десятковий формат цілого числа: %d%n", myInt);
        System.out.printf("10. Дробове число з двома знаками після коми: %.2f%n", myDouble);
    }

}

