package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a == 0 && b ==0){
                break;
            }
            System.out.println(a +b);
        }
    }
}
