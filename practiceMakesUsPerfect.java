package codechef.level500;

import java.util.Scanner;

public class practiceMakesUsPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P1 = sc.nextInt();
        int P2 = sc.nextInt();
        int P3 = sc.nextInt();
        int P4 = sc.nextInt();
        int count = 0 ;
        if (P1 >= 10 ) count++;
        if (P2 >= 10 ) count ++;
        if (P3 >= 10 ) count++;
        if (P4 >= 10 ) count ++;
        System.out.println(count);
    }
}
