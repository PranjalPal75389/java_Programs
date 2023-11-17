import java.util.Scanner;

public class print_sum_ofFirstN_number_recursion {
    public static void sum_first_numbers(int n, int sum,int limit) {
        if (n ==limit+1) {
            System.out.println(sum);
            return;
        }
        sum_first_numbers(n + 1, sum + n,limit);
    }
    public static void main(String[] args) {
        int sum = 0, n = 1, limit;
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();
        sum_first_numbers(n, sum,limit);
    }
}
