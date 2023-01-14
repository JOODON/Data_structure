package Step1_2;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("1부터 N까지에 합을 구합니다");
        System.out.println("N값 :");
        int n=in.nextInt();

        int sum=0;
        int i=1;

        while (i<n){
            sum+=i;
            i++;
        }
        System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");
    }
    public static void Repetition_for(){
        Scanner in=new Scanner(System.in);

        System.out.println("1부터 N까지에 합을 구합니다");
        System.out.println("N값 :");
        int n=in.nextInt();

        int sum=0;
        for(int i=1; i<=n; i++)
            sum+=i;
        System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");
    }
}
