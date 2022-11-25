import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner Sc = new Scanner(System.in);
        int N;
        System.out.println("Введите кол-во точек ");
        while (!Sc.hasNextInt()) {
            System.out.print("Введено не целое число, введите заново ");
            Sc.next();
        }
        N = Sc.nextInt();
        if (N < 0) {
            System.out.print("Введено неверное значение ");
        }
        int R;
        System.out.println("Введите радиус окружности ");
        while (!Sc.hasNextInt()) {
            System.out.print("Введено не целое число, введите заново ");
            Sc.next();
        }
        R = Sc.nextInt();

        int k = 0;
        while (N != 0) {
            System.out.println("Введите координату Х точки: ");
            while (!Sc.hasNextInt()) {
                System.out.print("Введено не целое число, введите заново ");
                Sc.next();
            }
            int X = Sc.nextInt();
            System.out.println("Введите координату Y точки: ");
            while (!Sc.hasNextInt()) {
                System.out.print("Введено не целое число, введите заново ");
                Sc.next();
            }
            int Y = Sc.nextInt();

            if ((X * X) + (Y * Y) <= (R * R)) {
                k++;
            } else {
                k = k;
            }
            N = N - 1;
        }
        System.out.println(k + " Кол-во точек в окружности: ");
    }
}


