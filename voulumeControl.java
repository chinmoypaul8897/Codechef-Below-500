package codechef.level500;

import java.util.Scanner;

public class voulumeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if ( X > Y ) System.out.println(X - Y );
            else System.out.println(Y-X);
        }
    }
}
