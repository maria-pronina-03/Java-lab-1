import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner

        String years = "лет";
        String months = "месяцев";
        String days = "дней";

        System.out.println("Введите день рождения(число): ");
        while(!sc.hasNextInt()){
            System.out.print("Введено не целое число, введите заново ");
                    sc.next();
        }
        int day= sc.nextInt();

        System.out.println("Введите месяц рождения(число): ");
        while(!sc.hasNextInt()){
            System.out.print("Введено не целое число, введите заново ");
            sc.next();
        }
        int month= sc.nextInt();

        System.out.println("Введите год рождения(число): ");
        while(!sc.hasNextInt()){
            System.out.print("Введено не целое число, введите заново ");
            sc.next();
        }
        int year= sc.nextInt();


        System.out.println(year+" "+years+" "+month+" " + months+" "+day+" " + days);
        }
    }


