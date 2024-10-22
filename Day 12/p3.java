mport java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd Number");
	int b = sc.nextInt();
	Codex chavi = new Codex();
	chavi.squa(a,b);
	chavi.cube(a,b);
    }	
  }

class Codex{
	  void cube(int a,int b){
	  int cube =  a*a*a;
	  int cube1 = b*b*b;
	  int sum = cube + cube1;
	  		System.out.println("Addition of  "  +(a*a*a)    +"&"    +(b*b*b)   +"is"  + sum);
	}
	  void squa(int a,int b){
	  int squa = a*a ;
	  int squa1 = b*b ;
	  int sub = a*a - b*b ;

	  		System.out.println("Substraction of "  +(a*a)    +"&"    +(b*b)  +"is"  +sub);
	  }
       }