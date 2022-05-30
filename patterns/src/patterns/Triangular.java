package patterns;

public class Triangular {
	public static void main(String[] args) {
		int n=5;
		int  num=65;
		int k=n+num;
		 k=(char)k;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
			System.out.print((char)(k-i));
			k++;
		}
			
			
			System.out.println();
	
			k=(char) (k-i);
	}

//		for (int i=n;i>=1;i--) {
//			for (int j=i;j<=n;j++) {
//				System.out.print((char)(j+64));
//				
//			}
//			System.out.println();
//		}
//		
}
} 