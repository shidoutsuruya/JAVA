import java.util.Arrays;
public class array 
{
    
    public static void example()
    {
        double[] a={43,54,1,7,11.5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        double[] copy_a=Arrays.copyOfRange(a,2,4);
        System.out.println(Arrays.toString(copy_a));
        System.out.println(Arrays.binarySearch(a,11.5));
        double[] c=new double[20];
        Arrays.fill(c,1.2);
        System.out.println(Arrays.toString(c));
        System.out.print(Math.random());
    }
    public static void multidimension()
    {
        int[][][] magic=
        {{
            {1,2,3,4},
            {1,2,3,4},
            {5,7,4,7},
            {2,3,4,5},
        },
        {
            {1,2,3,4},
            {1,2,3,4},
            {5,7,4,7},
            {2,3,4,5},
        }};
        System.out.println(Arrays.deepToString(magic));
    }
    public static void summary()
    {
        final int NMAX=100;
        int[][] odds=new int[NMAX+1][];
        for(int n=0;n<=NMAX;n++)
        {
            odds[n]=new int[n+1];
        }
        for(int n=0;n<odds.length;n++)
            for(int k=0;k<odds[n].length;k++)
            {
                int newodds=1;
                for (int i=1;i<=k;i++)
                    newodds=newodds*(n-i+1)/i;
                odds[n][k]=newodds;
            }
        for (int[] row:odds)
        {
            for(int odd:row)
                System.out.printf("%4d",odd);
            System.out.println();
        }
            


    }
    public static void main(String[] args)
    {
        summary(); 
    }
}
