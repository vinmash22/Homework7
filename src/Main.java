public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
            System.out.println("Год "+i + " численность населения составляет " + Math.round(populationSize));
        }
    }
}