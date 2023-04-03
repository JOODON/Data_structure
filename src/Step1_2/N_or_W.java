package Step1_2;

import java.util.Scanner;

public class N_or_W {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,w;

        System.out.println("*을 N개 출력하되 w줄에 맞춰서 출력합니다");

        do{
            System.out.print("N의값:");
            n=in.nextInt();
            System.out.print("W의값:");
            w=in.nextInt();
        }while (w <=0 || w > n);

        for (int i=0; i<n ; i++){
            System.out.print("*");
            if (i % w == w-1){
                System.out.println();
            }
        }
        if (n%w !=0)
            System.out.println();
    }
}
