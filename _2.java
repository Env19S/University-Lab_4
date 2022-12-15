import java.util.Scanner;

public class _2 {
    public static void
    main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int t = scanner.nextInt();
        //Время совместной работы.
        int t1 = (1-t/T)/(2*t/T);
        //Время выполнения всей работы.
        int t2 = t1 + t;{
            System.out.println(t2);
        }

    }
}
