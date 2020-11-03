import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if(number < 2) {
            System.out.printf("%d is not prime",number);
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    System.out.printf("%d is not prime",number);
                } else {
                    System.out.printf("%d is prime",number);
                }
            }
        }
    }
}
