import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class newnoob{
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your accounts score");
    int maths = sc.nextInt();
    System.out.println("enter your ocm score");
    int science = sc.nextInt();
    System.out.println("enter your eng score");
    int eng = sc.nextInt();
    System.out.println("enter your eco score");
    int hindi = sc.nextInt();
    System.out.println("enter your maths1 score");
    int maths1 = sc.nextInt();
    System.out.println("enter your IT score");
    int maths2 = sc.nextInt();
    System.out.println("how many subject do you have");
    int total_subject =sc.nextInt();
    int obtainmarks = maths+science+eng+hindi+maths1+maths2;
  //  int outofmarks = total_subject*100;
    /* System.out.println("enter score you obtain in exam");
    int  obtainmarks = sc.nextInt();
    System.out.println("enter out of marks");
    int outofmarks = sc.nextInt();  */
    System.out.println("your get "+obtainmarks/total_subject+"% in the exam");
}}