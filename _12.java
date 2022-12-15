import java.util.*;
import static java.lang.Math.*;
public class _12 {
    public static void
    main(String args[]) {
        Scanner in = new Scanner(System.in);
        double x, y, z, L;
        System.out.println("Введите переменную x");
        x = in.nextDouble();
        System.out.println("Введите переменную y");
        y = in.nextDouble();
        System.out.println("Введите переменную z");
        z = in.nextDouble();
        L = ((pow(x*y*z+cbrt(x+exp(y+z*z)), 1/4))/3)*(1+((cos(x*x))/(exp((pow(y, 3))+1))+sin(y*y))/pow(PI, x*x*x+1));
        System.out.println("L = " + L);
    }
}
