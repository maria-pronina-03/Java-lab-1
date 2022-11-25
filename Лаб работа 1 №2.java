import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int month;
        int day;
        String seasonString;
        System.out.println("введите день рождения(число)");
        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            day = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            if (day>31) {
                System.out.println("Вы ввели неверное число");
                return;
            }
            System.out.println("введите месяц рождения(число)");
            if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                month = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                switch (month) {
                    case 12:
                    case 1:
                    case 2:
                        seasonString = "Зима ";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        seasonString = "Весна ";
                        break;
                    case 6:
                    case 7:
                    case 8:
                        seasonString = "Осень";
                        break;
                    case 9:
                    case 10:
                    case 11:
                        seasonString = "Лето";
                        break;
                    default:
                        seasonString = "Ошибка";
                        break;
                }

                System.out.print(seasonString);
            } else System.out.println("Вы ввели не целое число");
        }

    }
}























