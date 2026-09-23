import java.util.Scanner;
public class Marks_Cal
{
    public static void main()
        { 
            int x;
            float av;
            Scanner sc = new Scanner(System.in);
            int i,a, s=0;
            System.out.println("Enter the number of subjects you have");
            x = sc.nextInt();
            for (i=1;i<=x;i++)
            {
                System.out.println("Enter marks for subject number"+i+" out 0f 100 ");
                a = sc.nextInt();
                s = s+a;
            }
            char c;
            av =(float) s/x;
            av = Math.round(av*10)/10.0f;
            if(av>=90.0)
            {
                c = 'A';
            }
            else if(av<90.0&&av>=80.0)
            {
                c = 'B';
            }
            else if(av<80.0&&av>=60.0)
            {
                c = 'C';
            }
            else if (av<60.0&&av>=50.0)
            {
                c = 'D';
            }
            else if (av<50.0&&av>=33.3)
            {
                c = 'E';
            }
            else 
            {
                c = 'F';
            }
            System.out.println("Total marks scored are = "+s+" "+"Out of"+(x*100));
            System.out.println("Percentage attained : "+av);
            System.out.println("Grade achieved :"+c);
        }
}