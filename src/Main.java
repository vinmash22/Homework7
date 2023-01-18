public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int month = 0;
        int deposit = 0;
        int input = 15_000;
        while (deposit < 2_459_000) {
            deposit = deposit + input;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + deposit + " рублей.");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (number = 10; number > 0; number = number - 1) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        double populationSize = 12_000_000.00;
        for (int i = 1; i <= 10; i++) {
            double birthRate = (populationSize / 1000) * 17;
            double mortalityRate = (populationSize / 1000) * 8;
            populationSize = populationSize + birthRate - mortalityRate;
            System.out.println("Год " + i + " численность населения составляет " + Math.round(populationSize));
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        double deposit = 15000.0;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + (deposit * 0.07);
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + Math.round(deposit) + " рублей.");
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("Задача 5");
        double deposit = 15000.0;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + (deposit * 0.07);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + Math.round(deposit) + " рублей.");
            }
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + Math.round(deposit) + " рублей.");
    }

    public static void task6() {
        System.out.println();
        System.out.println("Задача 6");
        double deposit = 15000.0;
        for (int month = 1; month <= 108; month++) {
            deposit = deposit + (deposit * 0.07);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + Math.round(deposit) + " рублей.");
            }
        }
    }

    public static void task7() {
        System.out.println();
        System.out.println("Задача 7");
        for (int friday = 6; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        System.out.println();
        System.out.println("Задача 8");
        int year = 2023;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (; yearBefore <= yearAfter; yearBefore = yearBefore + 1) {
            if (yearBefore % 79 == 0) {
                System.out.println(yearBefore);
            }
        }
    }
}
