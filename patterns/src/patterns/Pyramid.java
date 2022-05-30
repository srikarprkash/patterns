package patterns;

public class Pyramid {

	public static void main(String[] args) {
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//				
//			}
//			System.out.println();
//		}
		  int i = 1;
		    while(i < 3) {
		        int j = 0;
		        while(j < 5) {
		            j++;
		            if(j == 3) {
		                continue;
		            }
		            System.out.print(j + " ");
		        }
		        i++;
		    }
	}

}
