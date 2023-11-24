
public class Que_1 
{
	static int a=1;
	static int b;
	{
		b=5;
	}
	int c;
	float d;
	double d1;
	String str;
	
	
	

	public Que_1() {
		c=2;
		d=5.3f;
		d1=3.3;
		str="prathamesh Nale";
	}

	
	
	
	public Que_1(int c, float d, double d1, String str) {
	
		this.c = c;
		this.d = d;
		this.d1 = d1;
		this.str = str;
	}




	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Que_1.a = a;
	}
	public static int getB() {
		return b;
	}
	public static void setB(int b) {
		Que_1.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public float getD() {
		return d;
	}
	public void setD(float d) {
		this.d = d;
	}
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}



	@Override
	public String toString() {
		return "DefaultValues [a="+a+", b="+b+", c=" + c + ", d=" + d + ", d1=" + d1 + ", str=" + str + "]";
	}
	
}
