package javaP;

public class arrayp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {10,20,30};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		int a[][]= {{1,2,3},{4,5,6}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
