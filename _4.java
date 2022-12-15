import java.util.Scanner;
public class _4 {
    public static void
    main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //Поймал Петя.
        int f1 = x -y;
        //Поймали вместе.
        int f2 = f1 + x;
        System.out.println(f2);
    }
}
