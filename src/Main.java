public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1");
        System.out.println("Задание 1");
        int monthlyInvestment = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total += monthlyInvestment;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 2");
        int start = 0;
        int finish = 10;
        while (start < 10) {
            start++;
            System.out.print(start + " ");
        }
        System.out.println();
        for (finish = 10; finish >= 1; finish --) {
            System.out.print(finish + " ");
        }
        System.out.println();

        System.out.println("Задание 3");
        int population = 12_000_000;
        int population1 = population/1000;
        int fertility = population1 * 17;
        int mortality = population1 * 8;
        int totalGrowth = fertility - mortality;
        int populationGrowth = 0;
        for (int y = 1; y <= 10; y ++) {
            populationGrowth += population + totalGrowth;
            System.out.println("Год " + y + " численность населения составляет " + populationGrowth);
        }
        System.out.println("Домашнее задание - 2");

        System.out.println("Задание 1");
        int depositAmount = 15000;
        int month = 1;
        while (depositAmount < 12_000_000) {
            depositAmount =  depositAmount + depositAmount / 100 * 7;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + depositAmount + " рублей");
        }

        System.out.println("Задание 2");
        int depositAmount2 = 15000;
        int month2 = 1;
        for (; depositAmount2 < 12_000_000; month2 ++) {
            depositAmount2 =  depositAmount2 + depositAmount2 / 100 * 7;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + depositAmount2 + " рублей");
            }
        }

        System.out.println("Задание 3");
        int depositAmount3 = 15000;
        int month3 = 1;
        for (month3 = 1; month3 < 108; month3 ++) {
            depositAmount3 =  depositAmount3 + depositAmount3 / 100 * 7;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + depositAmount3 + " рублей");
            }
        }

        System.out.println("Задание 4");
        int friday = 2;
        for (; friday <= 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");

        }
        System.out.println("Домашнее задание - 3");

        System.out.println("Задание 1");
        int t = 0;
        int now = 2022;
        int future = now + 200;
        int past = now - 200;
            for (; t <= future; t += 79) {
                if (t >= past) {
                    System.out.println(t);
                }
            }

        System.out.println("Задание 2");
        for (int c = 1; c < 11; c ++) {
            int a = 2 ;
            int b = a * c;
            System.out.println(a + "*" + c + "=" + b);
        }





    }
}