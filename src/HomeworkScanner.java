import java.util.Scanner;

public class HomeworkScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++ ){
         sum = sum +i;
            System.out.println(sum);

        }

   }
}





