package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    /**
     * Метод для сложения двух чисел
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Метод для проверки, является ли число четным
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Метод для фильтрации четных чисел из списка
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (isEven(num)) {
                result.add(num);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Демонстрационное приложение ===");
        
        // Тестируем методы
        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);
        
        System.out.println("Число 4 четное? " + isEven(4));
        System.out.println("Число 7 четное? " + isEven(7));
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Четные числа из списка: " + evenNumbers);
    }
}