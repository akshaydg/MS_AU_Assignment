package Collections;

class GenericClass<T> implements Comparable{
	T var1;
	T var2;
	int var3;
	
	public int getVar3() {
		return var3;
	}
	public void setVar3(int var3) {
		this.var3 = var3;
	}
	public GenericClass() {
		// TODO Auto-generated constructor stub
	}
	public GenericClass(T var1, T var2, int var3){
		this.var1=var1;
		this.var2=var2;
		this.var3=var3;
	}
	
	
	public T getVar1() {
		return var1;
	}
	public void setVar1(T var1) {
		this.var1 = var1;
	}
	public T getVar2() {
		return var2;
	}
	public void setVar2(T var2) {
		this.var2 = var2;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		GenericClass<T> g = (GenericClass<T>)o;
		
		if(this.getVar3()<g.getVar3())
		{
			return -1;
		}
		else if(this.getVar3()==g.getVar3()) {
			return 0;
		}
		return 1;
		
		
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==this ) {
			return true;
		}
		else if(!(o instanceof GenericClass)) {
			return false;
		}
		else {
			GenericClass<T> g = (GenericClass<T>)o;
			return this.var1==g.var1&&this.var2==g.var2;
		}
		
	}
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<Integer> g1 = new GenericClass<Integer>(10,20,10);
		GenericClass<Integer> g2 = new GenericClass<Integer>(10,20,20);
		GenericClass<Integer> g3 = new GenericClass<Integer>(10,25,10);
		GenericClass<Integer> g4 = new GenericClass<Integer>(20,20,20);
		GenericClass<Integer> g5=g1;
		GenericClass<String> g6 = new GenericClass<String>("Akshay","Gaikwad",10);
		GenericClass<String> g7 = new GenericClass<String>("Akshay","Gaikwad",20);
		GenericClass<String> g8 = new GenericClass<String>("Akshay","Gaitonde",10);
		GenericClass<String> g9 = new GenericClass<String>("Rishav","Gupta",20);
		GenericClass<String> g10 = g6;
		System.out.println(g1.equals(g2));
		System.out.println(g1.equals(g3));
		System.out.println(g1.equals(g5));
		System.out.println(g6.equals(g7));
		System.out.println(g6.equals(g8));
		System.out.println(g1.equals(g10));
		System.out.println(g1.compareTo(g2));
		System.out.println(g1.compareTo(g3));
		System.out.println(g1.compareTo(g5));
		System.out.println(g6.compareTo(g7));
		System.out.println(g6.compareTo(g8));
		System.out.println(g1.compareTo(g10));
		

	}

}
