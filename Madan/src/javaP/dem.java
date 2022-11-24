package javaP;

class ov{
	public void displ(int a1)
	{
		System.out.print(a1);
	}
}
public class dem extends ov{
	public void displ(int a1)
	{
		System.out.print(a1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dem a2=new dem();
		a2.displ(10);
	}

}
