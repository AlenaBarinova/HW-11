public class Main {
    public static void main(String[] args) {
        //1
        int LeapYear = 2020;
        int notLeapYear = 2021;
        checkIsYearLeap(LeapYear);
        checkIsYearLeap(notLeapYear);

        //2
        int year = 2013;
        int os = 1;
        offerVersion(os, year);

        //3
        int deliveryDistance;
        printDeliveryInfo( deliveryDistance = 1);
        printDeliveryInfo( deliveryDistance = 25);
        printDeliveryInfo( deliveryDistance = 130);
    }

    public static void checkIsYearLeap(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + "год не является високосным\n");
        } else {
            System.out.println(year + "год является високосным\n");
        }
    }

    public static void offerVersion(int os, int year) {
        int borderYear = 2015;
        if (os ==0 && year < borderYear) {
            System.out.println(" Установите облегчённую версию для iOS по ссылке");
        } else if (os == 0 && year >= borderYear) {
            System.out.println(" Установите обычную версию для iOS по ссылке");
        } else if (os ==1 && year < borderYear) {
            System.out.println(" Установите обычную версию для Android по ссылке");
        } else if (os == 1 && year >= borderYear) {
            System.out.println(" Установите облегчённую версию для Android по ссылке");
        } else {
            System.out.println(" Не удалось определить версию");
        }
    }

    public static void printDeliveryInfo(int deliveryDistance) {
        int deliveryDays = getDeliveryDays(deliveryDistance);
        if (deliveryDays == -1){
            System.out.println("Доставки нет");
        } else {
            System.out.printf("Потребуется %s дня ", deliveryDays);
        }
    }
    public static int getDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <20) {
            return 1;
        } else if (deliveryDistance <=60) {
            return 2;
        }else if (deliveryDistance <100) {
            return 3;
        }else {
            return -1;
        }
    }
}