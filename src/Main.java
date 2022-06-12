import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        exeml1(2022);
        exeml2(1, 2022);
        int count_days = exeml3(34);
        System.out.println("На доставку вам надо " + count_days);


    }

    public static void exeml1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " высокосный");
        else
            System.out.println(year + " не высокосный");
    }

    public static void exeml2(int oc, int year) {
        int currentYear = LocalDate.now().getYear();

        if (oc == 0 && year >= currentYear)
            System.out.println(" У вас актуальная IOS");
        else if (oc == 0 && year < currentYear)
            System.out.println(" У вас старая версия IOS обновите!");
        else if (oc == 1 && year < currentYear)
            System.out.println(" У вас старая версия ANDROID обновите!");
        else
            System.out.println(" Я не знаю какая у вас операционная система");
    }

    public static int exeml3(int distance) {
        int days = 0;
        if (distance >= 0 && distance < 40)
            days += 1;
        if (distance > 40 && distance < 60)
            days += 2;
        if (distance > 60 && distance < 80)
            days += 3;
        if (distance >= 80)
            days += 4;
        return days;
    }
}
