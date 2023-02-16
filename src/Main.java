import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
    }
    public static void Task1()
    {
        System.out.println("Задание 1");
        int[] integerArray = new int[]{1,2,3};
        double[] doubleArray = new double[]{1.57,7.654,9.986};
        char[] charArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d'};
        System.out.println();
    }
    public static void Task2()
    {
        System.out.println("Задание 2");
        int[] integerArray = new int[]{1,2,3};
        double[] doubleArray = new double[]{1.57,7.654,9.986};
        char[] charArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d'};

        for(int i = 0; i < integerArray.length; i++)
        {
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1)
                System.out.print(",");
            else
                break;
        }
        System.out.println();

        for(int i = 0; i < doubleArray.length; i++)
        {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1)
                System.out.print(",");
            else
                break;
        }
        System.out.println();

        for(int i = 0; i < charArray.length; i++)
        {
            System.out.print(charArray[i]);
            if (i < charArray.length - 1)
                System.out.print(",");
            else
                break;
        }
        System.out.println();
        System.out.println();
    }
    public static void  Task3()
    {
        System.out.println("Задание 3");
        int[] integerArray = new int[]{1,2,3};
        double[] doubleArray = new double[]{1.57,7.654,9.986};
        char[] charArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d'};

        for(int i = integerArray.length - 1; i >= 0; i--)
        {
            System.out.print(integerArray[i]);
            if (i > 0)
                System.out.print(",");
            else
                break;
        }
        System.out.println();

        for(int i = doubleArray.length - 1; i >= 0; i--)
        {
            System.out.print(doubleArray[i]);
            if (i > 0)
                System.out.print(",");
            else
                break;
        }
        System.out.println();

        for(int i = charArray.length - 1; i >= 0; i--)
        {
            System.out.print(charArray[i]);
            if (i > 0)
                System.out.print(",");
            else
                break;
        }
        System.out.println();
        System.out.println();
    }

    public static void Task4()
    {
        System.out.println("Задание 4");
        int[] integerArray = new int[]{1,2,3};
        for(int i = 0; i < integerArray.length; i++) {
            if (integerArray[i]%2 != 0)
                integerArray[i] += 1;
        }
            System.out.print(Arrays.toString(integerArray));

    }
}