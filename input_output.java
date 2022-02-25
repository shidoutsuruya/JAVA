import java.util.*;
public class input_output 
{
    public static void input()
    {
        try (Scanner in = new Scanner(System.in)) 
        {
            System.out.print("What is your name?\n");
            String name=in.next();
            System.out.println(name);
            System.out.println("What is your age?");
            int age=in.nextShort()+5;
            System.out.println(age);
            boolean hasnext=in.hasNextInt();
            System.out.println(hasnext);
        }
    }
    public static void output()
    {
        double x=10000.2/3.2;
        System.out.printf("%+8.2f\n",x);
        System.out.printf("%tc\n",new Date());
        System.out.printf("%1$s %2$tB %2$te %2$tY\n","Due date:",new Date());
        System.out.printf("%s %tB %<te,%<tY","date:",new Date());
    }
    public static void main(String[] args)
    {
        output();
    }
}
