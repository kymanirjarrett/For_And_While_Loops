import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {


        for (int cnt = 0; cnt < 10; cnt++)   // cnt = cnt + 1
        {
            System.out.println(cnt);
        }

        System.out.println("\nNew Loop:");

        for (int cnt = 10; cnt > 0; cnt--)
        {
            System.out.println(cnt);
        }

        System.out.println("\nCount by 2 Loop:");

        for (int cnt = 1; cnt <= 10; cnt+= 2)   // cnt = cnt + 2
        {
            System.out.println(cnt);
        }


        int die1 = 0;
        int die2 = 1;
        Random rnd = new Random();

        while (die1 != die2)
        {
            die1 = rnd.nextInt(6) + 1;  // 0 - 5 + 1 -> 1 - 6
            die2 = rnd.nextInt(6) + 1;

            System.out.printf("%4d\t%4d\n", die1, die2);
        }

    }
}