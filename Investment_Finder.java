import java.util.Scanner;
public class Investment_Finder
 {
        public static void main()
        {
          Scanner sc = new Scanner(System.in);
          double p,m,t;
          double svr,sipr,rdr;
          double sipf,svf,rdf,qRate;
          System.out.println("Enter initial amount you have");
          p = sc.nextDouble();
          System.out.println("Enter monthly amount you wish to save");
          m = sc.nextDouble();
          System.out.println("Enter the tenure");
          t = sc.nextDouble();
          int t1 = (int)t*12;
          System.out.println("Enter Accordingly: 1 - To compare all savings options");
          System.out.println("2 - Savings account");
          System.out.println("3 - RD");
          System.out.println("4 - SIP");
          int a = sc.nextInt();
              if(a==1)
              {
              System.out.println("Enter the Savings account rate");
              svr = sc.nextDouble();
              svr = (svr / 100.0) / 12;
              svf = (p * Math.pow(1.0 + svr, t1)) + (m * ((Math.pow(1.0 + svr, t1) - 1.0) / svr) * (1.0 + svr));
              svf = Math.round(svf * 100.0) / 100.0;
              System.out.println("Enter the RD rate");
              rdr = sc.nextDouble();
              qRate = rdr / 400.0;
              rdf = m * ((Math.pow(1.0 + qRate, t1 / 3.0) - 1.0) / (1.0 - Math.pow(1.0 + qRate, -1.0 / 3.0)));
              rdf = Math.round(rdf * 100.0) / 100.0;
              System.out.println("Enter the SIP rate");
              sipr = sc.nextDouble();
              sipr = (sipr/100.0)/12;
              sipf = ((p*Math.pow(1+sipr,t1))+(m*((Math.pow(1.0+sipr,t1)-1.0)/sipr)*(1.0+sipr)));
              sipf = Math.round(sipf * 100.0) / 100.0;
              if (sipf >= svf && sipf >= rdf) 
              {
              System.out.println("Best option to save your fund: SIP");
              System.out.println("Future value: " +sipf);
              } 
              else if (svf >= sipf && svf >= rdf) 
              {
              System.out.println("Best option to save your fund: Savings Account");
              System.out.println("Future value: " +svf);
              } 
              else
              {
              System.out.println("Best option to save your fund: RD");
              System.out.println("Future value: " +rdf);
            }
        }
        if ( a==2)
        {
             System.out.println("Enter the Savings account rate");
              svr = sc.nextDouble();
              svr = (svr / 100.0) / 12;
              svf = (p * Math.pow(1.0 + svr, t1)) + (m * ((Math.pow(1.0 + svr, t1) - 1.0) / svr) * (1.0 + svr));
              svf = Math.round(svf * 100.0) / 100.0;
              System.out.println("Future value: "+svf);
        }
        if(a==3)
        {
             System.out.println("Enter the RD rate");
              rdr = sc.nextDouble();
              qRate = rdr / 400.0;
              rdf = m * ((Math.pow(1.0 + qRate, t1 / 3.0) - 1.0) / (1.0 - Math.pow(1.0 + qRate, -1.0 / 3.0)));
              rdf = Math.round(rdf * 100.0) / 100.0;
             System.out.println("Future value: "+rdf);
        }
        if( a==4)
        {
              System.out.println("Enter the SIP rate");
              sipr = sc.nextDouble();
              sipr = (sipr/100.0)/12;
              sipf = ((p*Math.pow(1+sipr,t1))+(m*((Math.pow(1.0+sipr,t1)-1.0)/sipr)*(1.0+sipr)));
              sipf = Math.round(sipf * 100.0) / 100.0;
              System.out.println("Future value: "+sipf);
        }
    }
}