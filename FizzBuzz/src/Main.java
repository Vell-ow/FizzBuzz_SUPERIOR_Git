public class Main {

    public static void main(String[] args)
    {
        System.out.println("These are the integers that will return 'Fizz': ");
        for(int i = 3; i < 101; i+=3)
        {
            if(i % 3 == 0 && i % 5 != 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("These are the integers that will return 'Buzz': ");
        for(int i = 5; i < 101; i+=5)
        {
            if(i % 3 != 0 && i % 5 == 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("These are the integers that will return 'FizzBuzz': ");
        for(int i = 15; i < 101; i+=15)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("\n");
        System.out.println("Ergo...");
        for(int i = 1; i < 101; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if((i % 3 != 0) && (i % 5 != 0) && (i % 15 != 0))
            {
                System.out.println(i);
            }
        }
    }
}
