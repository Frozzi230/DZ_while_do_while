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

        System.out.println("Задача 2");
        int money = 700;
        int day = 5;
//        System.out.println("Версия 1");
//        while (money != 0){
//            count += 1;
//            if (count % day == 0){
//                continue;
//            }
//            money = money - 100;
//            if (money == 0){
//                break;
//            }
//            int leftDay = money / 100;
//            System.out.println(money + " рублей хватит на " + leftDay + " дней");
//        }

        System.out.println("Версия 2");
        for (count = 0; money != 0; count ++){
            int leftDay = 0;
            if (count == 1){
                leftDay = money / 100;
                System.out.println(money + " рублей хватит на " + leftDay + " дней " + count);
            }
            if (count % 5 == 0){
                continue;
            }
            else {
                money = money - 100;
                leftDay = money / 100;
                if (money == 0){
                    break;
                }
                System.out.println(money + " рублей хватит на " + leftDay + " дней");
            }

        }

    }
}