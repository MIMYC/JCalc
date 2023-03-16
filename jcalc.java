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

}
