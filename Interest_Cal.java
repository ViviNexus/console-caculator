import java.util.Scanner;
public class Interest_Cal
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The amount you invested");
        float p = sc.nextFloat();
        System.out.println("The duration of the procedure in years");
        float t = sc.nextFloat();
        System.out.println("The interest you wish to calculate: For compound Interest enter 1, for simple inerest enter 2  ");
        int s = sc.nextInt();
        if(s==1)
        { 
          System.out.println("The annual rate that you are being charged with");
          float r = sc.nextFloat();
          System.out.println("Mention the compounding frequency");
          int n = sc.nextInt();
          float a = (float)n*t;
          float A =(float)(p*Math.pow(1+((r/100.0)/n),a));
          A = Math.round(A*10.0f)/10.0f;
          float CI = (float)(A-p);
          System.out.println("The amount of interest you are entitled with: "+CI);
          System.out.println("Maturity Amount: "+A);
        }
        if(s==2)
        {
          System.out.println("The rate that you are being charged with");
          float r = sc.nextFloat();
          float SI = (float)((p*r*t)/100);
          SI = Math.round(SI*10.0f)/10.0f;
          float A = p+SI;
          System.out.println("The amount of interest you are entitled with: "+SI);
          System.out.println("Maturity Amount: "+A);
        }
    }
}
