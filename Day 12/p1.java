import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd Number");
	int b = sc.nextInt();
	Codex chavi = new Codex();
	chavi.add(a,b);
	chavi.sub(a,b);

     }
  }

class Codex{
	 void add(int a,int b){
	 int sum= a+b;
		System.out.println("Addition is "   +sum);
	}
	 void sub(int a,int b){
	 if(b>a){
	 int sub= b-a;
		System.out.println("Substraction is "   +sub);
	}else {
		System.out.println();
	  }
       }
    }