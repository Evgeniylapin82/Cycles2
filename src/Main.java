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
        task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            ;
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int fertilityY = 17;
        int mortalityY = 8;
        int year = 0;
        fertilityY = populationY * fertilityY / 1000;
        mortalityY = populationY * mortalityY / 1000;
        while (year < 10) {
            year = year + 1;
            populationY = populationY + fertilityY - mortalityY;
            System.out.println("Год " + year + " Численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        int profit = 0;
        int month = 0;
        profit = profit + contribution;
        while (profit <= 12_000_000) {
            profit = profit + contribution * 7 / 100;
            month = month + 1;
            System.out.println("Месяц " + month + " Накоплено " + profit + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15000;
        int profit = 0;
        int month = 0;
        profit = profit + contribution;
        while (profit <= 12_000_000) {
            profit = profit + contribution * 7 / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Накоплено " + profit + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int profit = 0;
        int month = 0;
        int year = 0;
        profit = profit + contribution;
        while (year < 9) {
            profit = profit + contribution * 7 / 100;
            month = month + 1;
            if (month % 12 == 0)
                year = year + 1;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " Накоплено " + profit + " рублей");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        int number = 0;
        for (; number < 31; number++) {
            if (number == friday) {
                friday = friday + 7;
                System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int lastYears = 200;
        int yearL = 100;
        int cometFlyby = 79;
        int spanYear = 0;
        int yearS = year - lastYears;
        int yearE = year + yearL;
        for (int cometYear = yearS; cometYear <= yearE; cometYear++) {
            spanYear = spanYear + 1;
            if (cometYear % cometFlyby == 0) {
                System.out.println(cometYear);
            }
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
    }
}
