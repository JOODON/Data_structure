package Step1_2;

import java.util.Scanner;

public class Repetition_odd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        System.out.println("+ 와 -를 번갈아 가면서 N개 출력합니다");

        for (int i=0; i<n /2 ; i++)
            System.out.print("+-");
        if (n%2 !=0)
            System.out.print("+");
    }
}
