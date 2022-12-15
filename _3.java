import java.util.Scanner;
import static java.lang.Math.*;

public class _3 {
    public static void
    main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Находим диаметр.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x1 = ((a+b)/2);
            double x2;
            x2 = (pow(x1, 2));
        int x3 = ((b-a)/2);
            double x4;
            x4 = (pow(x3, 2));
        double d = x2 - x4;
        System.out.println(d);
        //Находим длину окружности.
        double C = d * PI;
        System.out.println(C);


                }

}
