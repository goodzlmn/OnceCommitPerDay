package d1227;

import java.util.Scanner;

public class C1227_1057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a==0 && b == 0) || (a==1&&b==1))
			System.out.println(1);
		else
			System.out.println(0);
	}
}
