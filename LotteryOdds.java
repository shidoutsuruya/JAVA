import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
public class LotteryOdds 
{
    public static void lottery()
    {
        try(Scanner in =new Scanner(System.in))
        {
            System.out.println("How many number do you need to draw?");
            int k=in.nextInt();
            System.out.println("What is the highest number?");
            int n= in.nextInt();
            int lotteryOdds=1;
            for (int i=1;i<=k;i++)
            {
                lotteryOdds=lotteryOdds*(n-i+1)/i;
            }
            System.out.println(lotteryOdds);
        }
    }
    public static void big_number()
    {
        try(Scanner in=new Scanner(System.in))
        {
            System.out.print("How many number?\n");
            int k=in.nextInt();
            System.out.println("What is the highest number");
            int n =in.nextInt();
            BigInteger lotteryOdds=BigInteger.valueOf(1);
            for (int i=1;i<=k;i++) 
            {
                lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-k));
                System.out.println(lotteryOdds);
            }
        }
    }
    public static void array()
    {
        
        /*
        for(int i=0;i<smallPrime.length;i++)
        {
            System.out.println(smallPrime[i]);
        }
        */
        double[] a=new double[100];
        for(int i=0;i<100;i++)
        {
            a[i]=(double) i*i;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void copy()
    {
        String[] authors={"James","Max","John","Sam"};
        String[] new_authors=Arrays.copyOf(authors,2);
        System.out.println(Arrays.toString(new_authors));
    }
    public static void main(String[] args)
    {
        copy();
    }
}
