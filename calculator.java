
import java.util.Scanner;
public class calculator {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number : " );
        float num1 = sc.nextFloat();
        System.out.println("Enter the second Number : ");
        float num2 = sc.nextFloat();
        System.out.println("Enter Your the No. from following list  ");
        System.out.println(" 1 . Addiction ");
        System.out.println(" 2 . Subtraction ");
        System.out.println(" 3 . Multi ");
        System.out.println(" 4 . Divide ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("The Sum is "+ (num2+num1));
                break;

            case 2 :
                System.out.println("The Subtraction is "+ (num1-num2));
                break;


            case 3:
                System.out.println("Multiplaction is "+ (num1* num2));
                break;

            case 4:
                if (num2 != 0)
                    System.out.println("Division = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default :
                System.out.println("Invalide number");
        }
    }
}
