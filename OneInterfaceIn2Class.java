import java.util.*;

abstract interface Shape{		
	abstract void display(int a);
}
class Single implements Shape{
	public void display(int a){
		System.out.println("Number : "+a);
	}	
}
class Square  extends Single implements Shape{	
	public void display(int a){	
		Single sc=new Single();
		sc.display(a);
		System.out.println("Square of "+a+" : "+a*a);
	}	
}
public class OneInterfaceIn2Class {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		Square R = new Square();
		R.display(num);		
	}
}