import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number : ");
		int b = sc.nextInt();
		
		System.out.println("Before Swap" + a + " " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap" + a + " " + b);
	
	}
}
/*Enter the 1st Number :
20 30
Enter the 2nd Number :
Before Swap20 30
After Swap30 20*/