package DAY1;
import java.util.Scanner;
public class Addition {
public static void main(String[]args) {
	int a=20;
	int b=20;
	int c=a+b;
	
	System.out.println("Addition of a= " +a +",b= "+b+ " is " +c);
	
	int d;
	int e;
	int f;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the values");
	d= sc.nextInt();
	e=sc.nextInt();
	f=d+e;
	System.out.print("The added values of d="+d+"and e=" +e+ " is "+f);
	
	
}
}
