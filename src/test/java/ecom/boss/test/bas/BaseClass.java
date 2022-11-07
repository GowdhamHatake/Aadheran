package ecom.boss.test.bas;

public class BaseClass {
int c = 5;	
private int add(int a,int b) {
	int c=a+b;
	return c;
	
}
public static void main(String[] args) {
	BaseClass b = new BaseClass();
	b.add(5, 4);
	System.out.println(b.add(10, 20));
	
	
}

}
