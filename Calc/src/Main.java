import java.util.*;
public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter numbers:");
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        System.out.print("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division");
		        System.out.println("\nEnter choice:");
		        int x = sc.nextInt();
		        switch (x){
		            case 1:
		                Add add = new Add();
		                add.addition(a,b);
		                break;
		            case 2:
		                Subtract sub = new Subtract();
		                sub.subtraction(a,b);
		                break;
		            case 3:
		                Multiply mul = new Multiply();
		                mul.multi(a,b);
		                break;
		            case 4:
		                Divide div = new Divide();
		                div.division(a,b);
		                break;
		            default :
		            	System.out.print("Invalid input");
		        }
sc.close();
	}

}
