
import java.util.Scanner;
public class  Fibonacci_recursion {
	
	static private int count;
	

	static void fab(int x, int y){
	int temp;
	if (x>y){
		temp=x; 
		x=y;
		y=temp;
	}
	count++;
	if(count==20)return;
	if(count==1) System.out.print(" "+x+" "+y);
	System.out.print(" "+(x+y));

	fab(y, (x+y));
	}
	


 public static void main(String[] args) {
	 Scanner keyboard=new Scanner(System.in);
count=0;
System.out.print("\t\t Welcome to my Fibonacci program \n\n");
System.out.print("Which two numbers would you like to start from?");
	 fab(keyboard.nextInt(),keyboard.nextInt());
	 
	}

}
