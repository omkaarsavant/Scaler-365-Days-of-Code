using System;

class Program
{
    static void Main()
    {
        int a = int.Parse(Console.ReadLine());
        long b = long.Parse(Console.ReadLine());
        char c = char.Parse(Console.ReadLine());
        decimal d = decimal.Parse(Console.ReadLine());
        double e = double.Parse(Console.ReadLine());

        Console.WriteLine(a);
        Console.WriteLine(b);
        Console.WriteLine(c);
        Console.WriteLine(d); // Print decimal without rounding
        Console.WriteLine(e.ToString().TrimEnd('0').TrimEnd('.')); // Print double without trailing zeros
    }
}
