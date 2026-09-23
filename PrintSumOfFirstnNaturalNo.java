import java.util.*;
public class PrintSumOfFirstnNaturalNo {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}