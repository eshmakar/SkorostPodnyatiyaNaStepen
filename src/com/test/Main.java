package com.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number:");
            String input = s.nextLine().trim();
            long start = System.nanoTime();

            try {
                int i = Integer.parseInt(input);
                BigDecimal big = new BigDecimal(i);
                big.pow(i);
                long end = System.nanoTime();
                double resultTimeSec = (double) (end - start) / 1000_000_000;
                double resultTimeMin = (double) (end - start) / 1000_000_000 / 60;
                System.out.printf("Результат вычисления %d в степени %d готово. Выполнено за %f сек. или за %f мин.", i, i, resultTimeSec, resultTimeMin);
                long countSymbol = String.valueOf(big.pow(i)).length();
                int count = String.valueOf(countSymbol).length();
                System.out.printf(" Кол-во символов: %d (%d)\n\n", countSymbol, count);

            } catch (Exception e) {
                System.err.println(("Вы ввели не правильные данные! Повторите попытку!").toUpperCase());
            }
        }
    }
}