
public class bai1 {

	public static void main(String[] args) {
		 int n=7, m=9;
	       for(int i=0;i<n;i++){
	           for(int j=0;j<m;j++){
	               if(i == 0 || j == 0 || i == n-1 || j == m-1)
	                   System.out.print("*");
	               else 
	                   System.out.print(" ");
	           }
	           System.out.print("\n");
	       }
	}
}
