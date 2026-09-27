import java.util.Scanner;
public class emi_cal
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float p,r,m =0;
        int t;
        System.out.println("Enter the amount you require as the loan");
        p = sc.nextFloat();
        System.out.println("Enter the rate of interest applicable");
        r = sc.nextFloat();
        System.out.println("Enter the tenure you require in years");
        t = sc.nextInt();
        t = t*12;
        r = (r/12)/100;
        m = (float)((p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1));
        m = Math.round(m*100.0f)/100.0f;
        float A = m*t;
        float I = A-p;
        System.out.println("The total interest applicable: "+I);
        System.out.println("The total amount to be paid: "+A);
        System.out.println("The amount to be paid each month: "+m);
    }
}