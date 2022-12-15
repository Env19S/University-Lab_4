import java.util.*;
import static java.lang.Math.*;

public class _1 {
    public static void
    main(String args[]) {
        Scanner in = new Scanner(System.in);
        double y, q, E;
        System.out.println("Введите переменную y");
        y = in.nextDouble();
        System.out.println("Введите переменную q");
        q = in.nextDouble();
        E = ((log(0.7 * y + 2 * q))/sqrt(3*y*y+0.5*y+4));
        System.out.println(E);
    }
}
