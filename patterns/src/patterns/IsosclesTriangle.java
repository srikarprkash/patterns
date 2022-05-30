package patterns;

public class IsosclesTriangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
				
				System.out.print(k);
				//int a=1;
				
				}
				int a=i-1;
				for(int h=1;h<=i-1;h++) {
					System.out.print(a);
					a--;
				}
			System.out.println();
			
		}
		
	}

}
