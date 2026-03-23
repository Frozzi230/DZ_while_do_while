public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int firstFriday = 6;
        for (int data = 1; data <= 31; data++) {
            if (data == firstFriday) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            }
            else if ((data - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + data + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();

        System.out.println("Задача 2");
        int count = 0;
        System.out.println("Версия 1");
        int firstDist = 42195;
        int firstSupportDist = 0;
//        do {
//            firstSupportDist = firstSupportDist + 500;
//            int dist = firstDist - firstSupportDist;
//            count += 1;
//            System.out.println("Держитесь! Осталось " + dist + " метров");
//            System.out.println(count);
//        } while (firstSupportDist <= firstDist);

        System.out.println("Версия 2");

        for (int i = firstSupportDist; i <= firstDist; i=i+500){
            int dist = firstDist - i;
            count += 1;
            System.out.println("Держитесь! Осталось " + dist + " метров");
            System.out.println(count);
        }

        System.out.println();

        System.out.println("Задача 3");
        int money = 700;
        int day = 5;
        int dayUsed = 0;
        System.out.println("Версия 1");
        count = 1;
        while (true){
            if (count % day == 0){
                dayUsed ++;
                count ++;
                continue;
            }
            else{
                if (money >= 100){
                    money -= 100;
                    dayUsed ++;
                    count ++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Бюджета хватит на " + dayUsed + " дней");

        System.out.println("Версия 2");
        money = 700;
        dayUsed = 0;
        for (count = 1; ; count++) {
            if (count % day == 0) {
                dayUsed++;
                continue;
            } else {
                if (money >= 100) {
                    money -= 100;
                    dayUsed++;
                } else {
                    break;
                }
            }
        }
        System.out.println("Бюджета хватит на " + dayUsed + " дней");

        System.out.println();

        System.out.println("Задача 4");
        int month = 0;
        int total = 0;
        int end = 12000000;
        System.out.println("Версия 1");
        while (true){
            month++;
            total += 15000;
            if (month % 6 == 0){
                total= total + (total / 100 * 7);
            }
            System.out.println("Номер месяца " + month + ", накопленная сумма: " + total);
            if (total >= end){
                break;
            }
        }
        System.out.println("Версия 2");
        month = 0;
        total = 0;
        do{
            month++;
            total += 15000;
            if (month % 6 == 0){
                total= total + (total / 100 * 7);
            }
            System.out.println("Номер месяца " + month + ", накопленная сумма: " + total);
            if (total >= end){
                break;
            }
        }
        while (true);

        System.out.println();

        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge != 100){
            minute++;
            if (minute % 10 == 0){
                minute = minute + 2;
                continue;
            }
            charge += 2;
            if (overheats == 3){
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + " %");
                break;
            }
        }
        System.out.println("Время зарядки составило: " + minute + " минут");
    }
}