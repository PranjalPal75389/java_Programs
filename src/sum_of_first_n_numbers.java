import java.util.Scanner;

public class sum_of_first_n_numbers
{
    public static void main(String[] args)
    {
        int i, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            System.out.print("+" + i); // this line is just to show off
            sum = sum + i;
        }
        System.out.println("=" + sum);
    }
}
