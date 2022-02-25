import java.util.*;
public class retirement 
{
    public static void run(String[] args)
    {
        try(Scanner in= new Scanner(System.in))
        {
            System.out.println("How mush money?");
            
            double goal=in.nextDouble();
            String a="how much you need contribute?";
            System.out.println(a);
            double payment=in.nextDouble();
            System.out.println("Interest rate");
            double interestRate=in.nextDouble();
            
            double balance=0;
            int years=0;
            
            while(balance<goal)
            {
                balance+=payment;
                double interest=balance*interestRate/100;
                balance+=interest;
                years+=1;
            }
            System.out.println("hello "+years);
        }
    }
    public static void main(String[] args)
    {
        run(args);
    }
}
