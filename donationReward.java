package codechef.level500;

import java.util.Scanner;

public class donationReward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            if ( X <=  3 ) System.out.println("BRONZE");
            else if ( X > 3 && X <= 6 ) System.out.println("SILVER");
            else if (X > 6 ) System.out.println("GOLD");
        }
    }
}
