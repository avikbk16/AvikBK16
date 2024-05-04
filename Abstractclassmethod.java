package assignment;
abstract class abs1
{
	
abstract void add() ;
	

/*{
System.out.println("add");	
}*/
void sub()
{System.out.println("sub");}

}
abstract class abs2 extends abs1
{
	abstract void fun1();
	abstract void fun2();
void add1()
{
System.out.println("add1");	
}
void sub1()
{System.out.println("sub1");}
}
public class Abstractclassmethod extends abs2 {
	static void cm1()
	{
		System.out.println("concrete method 1");
	}
	
	 void cm2()
	{
		System.out.println("concrete method 2");
	}
	public static void main(String[] args) {
		
		cm1();
		Abstractclassmethod rv = new Abstractclassmethod();
		rv.cm2();
		//rv.add();
		rv.fun1();
		rv.fun2();

	}

	@Override
	void fun1() {
		System.out.println("abstarct function 1");
		
	}

	@Override
	void fun2() {
		System.out.println("abstract function 2");
		
	}

}
