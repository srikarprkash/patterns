package patterns;

import java.util.Scanner;

public class Inversefloyd {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		//int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			int num=1;
			for(int k=1;k<=i;k++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}

}
