package javaP;

class over{
	public void displ(int a1)
	{
		System.out.print(a1);
	}
}
public class demo extends over{
	public void displ(int a1)
	{
		System.out.print(a1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo a2=new demo();
		displ(10);
	}

}
