package JCalc;
public class jcalc
{

    //Pi
    public static final double pi = 22/7.0;
    
    //Factorial
    public static int factorial(int x)
    {
        int product = 1;
        for (int i = 1; i <= x; i++)
        {
            product*=i;
        }
        return(product);
    }

    //area of rectangle
    public static double arRect(double l, double b)
    {
        return l*b;
    }

    //area of circle
    public static double arCircle(double r)
    {
        return pi*r*r;
    }

    //area of triangle
    public static double arTri(double a, double b, double c)
    {
        double ar;
        double s = a+b+c/2.0;
        ar = Math.sqrt((s-a)*(s-b)*(s-c)*(s));
        return ar;
    }

}