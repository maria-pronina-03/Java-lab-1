import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int n=0;
        System.out.println("введите число x");
            while(!sc.hasNextInt()){
                System.out.print("Введено не целое число, введите заново ");
                sc.next();
            }
            x= sc.nextInt();

         System.out.println("введите число n");
        while(!sc.hasNextInt()){
            System.out.print("Введено не целое число, введите заново ");
            sc.next();
        }
        n= sc.nextInt();
        if (n>15 | n<-15){
            System.out.print("Введено неверное число");
        }
        System.out.println("x: " +x);
        System.out.println("n: " +n);
        if((int) n>=0){
            int k =1;
            for(int h = 1; h<= n; h++){
                k=k*x;
            }
            System.out.println("Ответ: " +k);
        }
        else{
            n =-n;
            float k =1;
            for(int h = 1; h<= n; h++){
                k=k*x;
            }
            float f =(float) 1/k;
            System.out.println("Ответ: " +f);
        }
    }

}

