package JCalc;
public class jcalc
{
    
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
    public static double arRec(double l, double b)
    {
        return l*b;
    }

    //area of circle
    public static double arCircle(double r)
    {
        return Math.PI*r*r;
    }

    //area of triangle
    public static double arTri(double a, double b, double c)
    {
        double s = a+b+c/2.0;
        double ar = Math.sqrt((s-a)*(s-b)*(s-c)*(s));
        return ar;
    }

    //Linear equation
    public static double solve(double a, double b, double result)
    {
        double x;
        result-=b;
        result/=a;
        x = result;
        return(x);
    }

    //Quadratic equation
    public static double solve1(double a, double b, double c, double result)
    {
        double x;
        c-=result;
        x = (b*(-1) + Math.sqrt((b*b) - 4*a*c))/2*a;
        return(x);
    }
    public static double solve2(double a, double b, double c, double result)
    {
        double x;
        c-=result;
        x = (b*(-1) - Math.sqrt((b*b) - 4*a*c))/2*a;
        return(x);
    }
}