package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!"); //строка выводится в консоль

        double x = 17.6;
        double y =14.8;
        int c = (int)(x+y);
        int d = (int)x + (int)y;
        System.out.println(c + ", " + d); //неявное приведение типов работает в одном направлении - от менее точных
                                          // к более точным, чтобы не терялась информация

        String str = "I love my string";   //Строки
        System.out.println(str.length());
        System.out.println(str.charAt(5));

        int[] array = {8, 74, 69, 1, 128}; // Массивы
        System.out.println(array[2]);

        // Задания к главе "Язык Java. Основы"
        String  FirstName = "Irina";               // 1 задание
        String  LastName = "Grishanovich";
        int age = 25;
        double weight = 55.5;
        System.out.println(FirstName + " " + LastName + ", age: " + age + ", weight: " + weight);

        String name = "Irina Grishanovich";        // 3 задание
        String MiddleName = "Vyacheslavovna";
        System.out.println(name.length());
        System.out.println(name.charAt(7));
        System.out.println(name.concat(" ").concat(MiddleName));
        System.out.println(name.contains("u"));
        System.out.println(name.equals(MiddleName));
        System.out.println(name.substring(6, name.length()-5));
        System.out.println(name.startsWith("Irin"));
        System.out.println(name.endsWith("vich"));
        System.out.println(name.replace("Grishanovich", MiddleName));

        int salary = 500;                           // 4 задание
        int i = 0;
        while (i < 12) {
            salary = salary + 1000;
            i++;
        }
        System.out.println(salary);

        int salary1 = 500;
        int a = 0;
        do{
            salary1 = salary1 + 1000;
            a++;
        } while (a < 12);
        System.out.println(salary1);

        int salary2 = 500;
        for(int j = 0; j < 12; j++){
            salary2 = salary2 + 1000;
        }
        System.out.println(salary2);

    }
}
