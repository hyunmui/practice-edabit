using System;

namespace Practice.Edabit.Solutions.App
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }

        public static int NextPrime(int num)
        {
            while(true) {
                if (IsPrime(num))
                    return num;
                num++;
            }
        }

        private static bool IsPrime(int val)
        {
            if (val == 1)
                return false;

            for (int i = 2; i <= Math.Sqrt(val); i++)
            {
                if (val % i == 0)
                    return false;
            }

            return true;
        }
    }
}
